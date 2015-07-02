package unwrittenfun.minecraft.immersiveintegration.blocks;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import unwrittenfun.minecraft.immersiveintegration.ImmersiveIntegration;

public class BlockSteelTrapdoor extends BlockTrapDoor {
  protected BlockSteelTrapdoor(String key) {
    super(Material.iron);
    setBlockName(key);
    setBlockTextureName(key);
    setCreativeTab(ImmersiveIntegration.iiCreativeTab);
  }
}
