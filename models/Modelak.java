// Made with Blockbench 3.8.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelak extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public Modelak() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 3).addBox(-9.0F, -8.5F, 8.25F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 3).addBox(-7.75F, -8.25F, 7.25F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 1).addBox(-7.0F, -7.5F, 4.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 4).addBox(-4.5F, -8.5F, 8.25F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 4).addBox(-8.125F, -4.875F, 8.25F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 3).addBox(-8.125F, -8.625F, 11.75F, 3.0F, 4.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 3).addBox(-8.125F, -8.625F, 8.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 3).addBox(-7.625F, -8.125F, 12.75F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 4).addBox(-8.125F, -9.375F, 8.25F, 3.0F, 1.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}