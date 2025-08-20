package net.donne431.ice_and_fire_delight.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.TridentItem;
import net.donne431.ice_and_fire_delight.block.BlackDragonCuttingBoardBlock;
import vectorwing.farmersdelight.client.renderer.CuttingBoardRenderer;
import vectorwing.farmersdelight.common.block.CuttingBoardBlock;
import vectorwing.farmersdelight.common.block.entity.CuttingBoardBlockEntity;
import vectorwing.farmersdelight.common.tag.ModTags;

public class CustomCuttingBoardRenderer implements BlockEntityRenderer<CuttingBoardBlockEntity> {
    private final CuttingBoardRenderer defaultRenderer;

    public CustomCuttingBoardRenderer(BlockEntityRendererProvider.Context context) {
        this.defaultRenderer = new CuttingBoardRenderer(context);
    }

    @Override
    public void render(CuttingBoardBlockEntity entity, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int combinedLight, int combinedOverlay) {
        if (entity.getBlockState().getBlock() instanceof BlackDragonCuttingBoardBlock) {
            ItemStack boardStack = entity.getStoredItem();
            System.out.println("Rendering item for BlackDragonCuttingBoard: " + boardStack + " at pos: " + entity.getBlockPos() + ", empty: " + boardStack.isEmpty());
            if (!boardStack.isEmpty()) {
                poseStack.pushPose();

                ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
                Direction direction = entity.getBlockState().getValue(CuttingBoardBlock.FACING).getOpposite();
                float rotationY = -direction.toYRot(); // north: 0, east: 90, south: 180, west: 270
                int posLong = (int) entity.getBlockPos().asLong();

                // Проверка типа предмета
                boolean isBlockItem = itemRenderer.getModel(boardStack, entity.getLevel(), null, 0)
                        .applyTransform(ItemDisplayContext.FIXED, poseStack, false).isGui3d();
                System.out.println("Item isBlockItem: " + isBlockItem + ", direction: " + direction + ", rotationY: " + rotationY);

                // Выбор метода рендеринга
                if (entity.isItemCarvingBoard()) {
                    renderItemCarved(poseStack, direction, boardStack);
                    System.out.println("Rendering as carved item, translate: (0.5, 0.23, 0.5), scale: (0.6, 0.6, 0.6)");
                } else if (isBlockItem && !boardStack.is(ModTags.FLAT_ON_CUTTING_BOARD)) {
                    renderBlock(poseStack, direction);
                    System.out.println("Rendering as block, translate: (0.5, 0.27, 0.5), scale: (0.8, 0.8, 0.8)");
                } else {
                    renderItemLayingDown(poseStack, direction);
                    System.out.println("Rendering as flat item, translate: (0.5, 0.08, 0.5), scale: (0.6, 0.6, 0.6)");
                }

                // Рендеринг предмета
                itemRenderer.renderStatic(boardStack, ItemDisplayContext.FIXED, combinedLight, combinedOverlay,
                        poseStack, buffer, entity.getLevel(), posLong);
                poseStack.popPose();
            } else {
                System.out.println("No item to render for BlackDragonCuttingBoard at pos: " + entity.getBlockPos());
            }
        } else {
            defaultRenderer.render(entity, partialTicks, poseStack, buffer, combinedLight, combinedOverlay);
        }
    }

    private void renderItemLayingDown(PoseStack matrixStackIn, Direction direction) {
        matrixStackIn.translate(0.5D, 0.08D, 0.5D);
        float f = -direction.toYRot(); // Синхронизация с blockstates: north=0, east=90, south=180, west=270
        matrixStackIn.mulPose(Axis.YP.rotationDegrees(f));
        matrixStackIn.mulPose(Axis.XP.rotationDegrees(90.0F));
        matrixStackIn.scale(0.6F, 0.6F, 0.6F);
    }

    private void renderBlock(PoseStack matrixStackIn, Direction direction) {
        matrixStackIn.translate(0.5D, 0.27D, 0.5D);
        float f = -direction.toYRot();
        matrixStackIn.mulPose(Axis.YP.rotationDegrees(f));
        matrixStackIn.scale(0.8F, 0.8F, 0.8F);
    }

    private void renderItemCarved(PoseStack matrixStackIn, Direction direction, ItemStack itemStack) {
        matrixStackIn.translate(0.5D, 0.23D, 0.5D);
        float f = -direction.toYRot() + 180;
        matrixStackIn.mulPose(Axis.YP.rotationDegrees(f));
        float poseAngle;
        if (itemStack.getItem() instanceof PickaxeItem || itemStack.getItem() instanceof HoeItem) {
            poseAngle = 225.0F;
        } else if (itemStack.getItem() instanceof TridentItem) {
            poseAngle = 135.0F;
        } else {
            poseAngle = 180.0F;
        }
        matrixStackIn.mulPose(Axis.ZP.rotationDegrees(poseAngle));
        matrixStackIn.scale(0.6F, 0.6F, 0.6F);
    }
}