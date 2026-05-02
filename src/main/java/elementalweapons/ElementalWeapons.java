package elementalweapons;

import legend.game.inventory.EquipmentRegistryEvent;
import legend.game.inventory.EquipmentTypes;
import legend.game.inventory.GatherEquipmentTypesEvent;
import legend.game.inventory.screens.ShopScreen;
import legend.game.modding.events.inventory.ShopContentsEvent;
import legend.lodmod.LodShops;
import org.legendofdragoon.modloader.Mod;
import org.legendofdragoon.modloader.events.EventListener;
import org.legendofdragoon.modloader.registries.RegistryId;

import static legend.core.GameEngine.EVENTS;

@Mod(id = ElementalWeapons.MOD_ID, version = "^3.0.0")
public class ElementalWeapons {
  public static final String MOD_ID = "elementalweapons";

  public ElementalWeapons() {
    EVENTS.register(this);
  }

  public static RegistryId id(final String entryId) {
    return new RegistryId(MOD_ID, entryId);
  }

  @EventListener
  public void registerEquipments(final EquipmentRegistryEvent event) { Equipments.register(event); }
  @EventListener
  public void shopEquipmentEvent(final ShopContentsEvent event) {
    if (event.shop == LodShops.BALE_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DAMP_BLADE.get(), 80));
    }
    if (event.shop == LodShops.LOHAN_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.THIEF_CAPE.get(), 500));
    }
    if (event.shop == LodShops.KAZAS_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.STATIC_KNUCKLES.get(), 100));
    }
    if (event.shop == LodShops.FLETZ_ACCESSORY_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.THIEF_SCARF.get(), 1000));
    }
    if (event.shop == LodShops.FLETZ_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BLACK_BLADE.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.GLOWING_BLADE.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BRIGHT_HALBERD.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DARK_HALBERD.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SHINING_ARROW.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BLINDING_ARROW.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SHINING_LIGHT.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.FLASHY_FIST.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.HIDDEN_FIST.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.HOLY_MACE.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.UNHOLY_MACE.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.GLARE_BROADAXE.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.GRAVEN_BROADAXE.get(), 210));
    }
    if (event.shop == LodShops.DONAU_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.GUST_LONGSWORD.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.GRAVEL_LONGSWORD.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.STONE_LANCE.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.AIR_ARROW.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.ROCK_ARROW.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.WINDS_LAMENT.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.EARTHS_ETUDE.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.FLEETING_FIST.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.STURDY_FIST.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.GUSTY_MALLET.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.STONE_MALLET.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.AXE_OF_GUSTS.get(), 210));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.PEBBLE_AXE.get(), 210));

    }
    if (event.shop == LodShops.FUENO_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BLAZING_BROADSWORD.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.WATER_BROADSWORD.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SHOCKING_BROADBLADE.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BURNING_PARTISAN.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.LIQUID_SPEAR.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.ELECTRIC_SWORDLANCE.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SMOLDERING_ARROW.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SPLASHING_ARROW.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.STINGING_ARROW.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.EMBERS_GLOW.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.WATERS_EDGE.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.THUNDER_CRACK.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.FLAMING_FIST.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.RAPIDS_FIST.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.STORM_FIST.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.HOT_HAMMER.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.COLD_HAMMER.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.ZAP_HAMMER.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.MOLTEN_GREATAXE.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.LAKE_GREATAXE.get(), 250));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.THUNDERCLAP.get(), 250));
    }
    if (event.shop == LodShops.WINGLY_FOREST_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.WINGLY_MANTLE.get(), 1500));
    }
    if (event.shop == LodShops.ULARA_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.INFERNO_GREATSWORD.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.OCEAN_GREATSWORD.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.HURRICANE_CLAYMORE.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.STONE_CLAYMORE.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BLINDING_ZWEIHANDER.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.NIGHT_ZWEIHANDER.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.LIGHTNING_GREATBLADE.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.FLAMING_PARTISAN.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.WHIRLPOOL_SPEAR.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.VORTEX_GLAIVE.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.CANYON_LANCE.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DAWN_HALBERD.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DUSK_HALBERD.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.CURRENT_SWORDLANCE.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.HEAVEN_BOW.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.HELL_BOW.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.COMBUSTION_BOW.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DROWNING_BOW.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.WIND_BOW.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BOULDER_BOW.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TINGLING_BOW.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DARKNESS_SHEARER.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.LIGHT_BRINGER.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.FIRES_ROAR.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.RIVERS_FLOW.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.AIRS_REQUIEM.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.MOUNTAINS_DIRGE.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.LIGHTNING_REPRISE.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.IFRIT_FIST.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.LEVIATHAN_FIST.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.GARUDA_FIST.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TITAN_FIST.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.PHOENIX_FIST.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DIABOLOS_FIST.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TORRENTIAL_BLOW.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.FLARE_CROZIER.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SYLPH_HAMMER.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.GNOME_HAMMER.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.PALADINS_MACE.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.CORRUPTED_MACE.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.LIGHTNING_STRIKE.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.CRAG_AXE.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TORNADO_AXE.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.VOLCANO_GREATAXE.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.GREATAXE_OF_THE_SEA.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SHINING_BROADAXE.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BROADAXE_OF_THE_DEAD.get(), 400));
      event.contents.add(new ShopScreen.ShopEntry<>(Equipments.THUNDEROUS_ROAR.get(), 400));
    }
  }

@EventListener
public static void gatherEquipmentTypes(final GatherEquipmentTypesEvent event) {
  event.add(Equipments.DAMP_BLADE.get(), EquipmentTypes.LONGSWORD);
  event.add(Equipments.WATER_BROADSWORD.get(), EquipmentTypes.LONGSWORD);
  event.add(Equipments.OCEAN_GREATSWORD.get(), EquipmentTypes.LONGSWORD);
  event.add(Equipments.BLAZING_BROADSWORD.get(), EquipmentTypes.LONGSWORD);
  event.add(Equipments.INFERNO_GREATSWORD.get(), EquipmentTypes.LONGSWORD);
  event.add(Equipments.GUST_LONGSWORD.get(), EquipmentTypes.LONGSWORD);
  event.add(Equipments.GRAVEL_LONGSWORD.get(), EquipmentTypes.LONGSWORD);
  event.add(Equipments.GLOWING_BLADE.get(), EquipmentTypes.LONGSWORD);
  event.add(Equipments.BLACK_BLADE.get(), EquipmentTypes.LONGSWORD);
  event.add(Equipments.SHOCKING_BROADBLADE.get(), EquipmentTypes.LONGSWORD);
  event.add(Equipments.HURRICANE_CLAYMORE.get(), EquipmentTypes.LONGSWORD);
  event.add(Equipments.STONE_CLAYMORE.get(), EquipmentTypes.LONGSWORD);
  event.add(Equipments.BLINDING_ZWEIHANDER.get(), EquipmentTypes.LONGSWORD);
  event.add(Equipments.NIGHT_ZWEIHANDER.get(), EquipmentTypes.LONGSWORD);
  event.add(Equipments.LIGHTNING_GREATBLADE.get(), EquipmentTypes.LONGSWORD);
  event.add(Equipments.VORTEX_GLAIVE.get(), EquipmentTypes.POLEARM);
  event.add(Equipments.STONE_LANCE.get(), EquipmentTypes.POLEARM);
  event.add(Equipments.CANYON_LANCE.get(), EquipmentTypes.POLEARM);
  event.add(Equipments.BURNING_PARTISAN.get(), EquipmentTypes.POLEARM);
  event.add(Equipments.LIQUID_SPEAR.get(), EquipmentTypes.POLEARM);
  event.add(Equipments.BRIGHT_HALBERD.get(), EquipmentTypes.POLEARM);
  event.add(Equipments.DARK_HALBERD.get(), EquipmentTypes.POLEARM);
  event.add(Equipments.ELECTRIC_SWORDLANCE.get(), EquipmentTypes.POLEARM);
  event.add(Equipments.FLAMING_PARTISAN.get(), EquipmentTypes.POLEARM);
  event.add(Equipments.WHIRLPOOL_SPEAR.get(), EquipmentTypes.POLEARM);
  event.add(Equipments.DAWN_HALBERD.get(), EquipmentTypes.POLEARM);
  event.add(Equipments.DUSK_HALBERD.get(), EquipmentTypes.POLEARM);
  event.add(Equipments.CURRENT_SWORDLANCE.get(), EquipmentTypes.POLEARM);
  event.add(Equipments.SHINING_ARROW.get(), EquipmentTypes.BOW);
  event.add(Equipments.HEAVEN_BOW.get(), EquipmentTypes.BOW);
  event.add(Equipments.BLINDING_ARROW.get(), EquipmentTypes.BOW);
  event.add(Equipments.HELL_BOW.get(), EquipmentTypes.BOW);
  event.add(Equipments.SMOLDERING_ARROW.get(), EquipmentTypes.BOW);
  event.add(Equipments.SPLASHING_ARROW.get(), EquipmentTypes.BOW);
  event.add(Equipments.AIR_ARROW.get(), EquipmentTypes.BOW);
  event.add(Equipments.ROCK_ARROW.get(), EquipmentTypes.BOW);
  event.add(Equipments.STINGING_ARROW.get(), EquipmentTypes.BOW);
  event.add(Equipments.COMBUSTION_BOW.get(), EquipmentTypes.BOW);
  event.add(Equipments.DROWNING_BOW.get(), EquipmentTypes.BOW);
  event.add(Equipments.WIND_BOW.get(), EquipmentTypes.BOW);
  event.add(Equipments.BOULDER_BOW.get(), EquipmentTypes.BOW);
  event.add(Equipments.TINGLING_BOW.get(), EquipmentTypes.BOW);
  event.add(Equipments.DARKNESS_SHEARER.get(), EquipmentTypes.SHORTSWORD);
  event.add(Equipments.SHINING_LIGHT.get(), EquipmentTypes.SHORTSWORD);
  event.add(Equipments.LIGHT_BRINGER.get(), EquipmentTypes.SHORTSWORD);
  event.add(Equipments.EMBERS_GLOW.get(), EquipmentTypes.SHORTSWORD);
  event.add(Equipments.WATERS_EDGE.get(), EquipmentTypes.SHORTSWORD);
  event.add(Equipments.WINDS_LAMENT.get(), EquipmentTypes.SHORTSWORD);
  event.add(Equipments.EARTHS_ETUDE.get(), EquipmentTypes.SHORTSWORD);
  event.add(Equipments.THUNDER_CRACK.get(), EquipmentTypes.SHORTSWORD);
  event.add(Equipments.FIRES_ROAR.get(), EquipmentTypes.SHORTSWORD);
  event.add(Equipments.RIVERS_FLOW.get(), EquipmentTypes.SHORTSWORD);
  event.add(Equipments.AIRS_REQUIEM.get(), EquipmentTypes.SHORTSWORD);
  event.add(Equipments.MOUNTAINS_DIRGE.get(), EquipmentTypes.SHORTSWORD);
  event.add(Equipments.LIGHTNING_REPRISE.get(), EquipmentTypes.SHORTSWORD);
  event.add(Equipments.STATIC_KNUCKLES.get(), EquipmentTypes.HAND);
  event.add(Equipments.STORM_FIST.get(), EquipmentTypes.HAND);
  event.add(Equipments.FLAMING_FIST.get(), EquipmentTypes.HAND);
  event.add(Equipments.RAPIDS_FIST.get(), EquipmentTypes.HAND);
  event.add(Equipments.FLEETING_FIST.get(), EquipmentTypes.HAND);
  event.add(Equipments.STURDY_FIST.get(), EquipmentTypes.HAND);
  event.add(Equipments.FLASHY_FIST.get(), EquipmentTypes.HAND);
  event.add(Equipments.HIDDEN_FIST.get(), EquipmentTypes.HAND);
  event.add(Equipments.IFRIT_FIST.get(), EquipmentTypes.HAND);
  event.add(Equipments.LEVIATHAN_FIST.get(), EquipmentTypes.HAND);
  event.add(Equipments.GARUDA_FIST.get(), EquipmentTypes.HAND);
  event.add(Equipments.TITAN_FIST.get(), EquipmentTypes.HAND);
  event.add(Equipments.PHOENIX_FIST.get(), EquipmentTypes.HAND);
  event.add(Equipments.DIABOLOS_FIST.get(), EquipmentTypes.HAND);
  event.add(Equipments.TORRENTIAL_BLOW.get(), EquipmentTypes.HAMMER);
  event.add(Equipments.HOT_HAMMER.get(), EquipmentTypes.HAMMER);
  event.add(Equipments.FLARE_CROZIER.get(), EquipmentTypes.HAMMER);
  event.add(Equipments.COLD_HAMMER.get(), EquipmentTypes.HAMMER);
  event.add(Equipments.GUSTY_MALLET.get(), EquipmentTypes.HAMMER);
  event.add(Equipments.STONE_MALLET.get(), EquipmentTypes.HAMMER);
  event.add(Equipments.HOLY_MACE.get(), EquipmentTypes.HAMMER);
  event.add(Equipments.UNHOLY_MACE.get(), EquipmentTypes.HAMMER);
  event.add(Equipments.ZAP_HAMMER.get(), EquipmentTypes.HAMMER);
  event.add(Equipments.SYLPH_HAMMER.get(), EquipmentTypes.HAMMER);
  event.add(Equipments.GNOME_HAMMER.get(), EquipmentTypes.HAMMER);
  event.add(Equipments.PALADINS_MACE.get(), EquipmentTypes.HAMMER);
  event.add(Equipments.CORRUPTED_MACE.get(), EquipmentTypes.HAMMER);
  event.add(Equipments.LIGHTNING_STRIKE.get(), EquipmentTypes.HAMMER);
  event.add(Equipments.CRAG_AXE.get(), EquipmentTypes.AXE);
  event.add(Equipments.AXE_OF_GUSTS.get(), EquipmentTypes.AXE);
  event.add(Equipments.TORNADO_AXE.get(), EquipmentTypes.AXE);
  event.add(Equipments.PEBBLE_AXE.get(), EquipmentTypes.AXE);
  event.add(Equipments.MOLTEN_GREATAXE.get(), EquipmentTypes.AXE);
  event.add(Equipments.LAKE_GREATAXE.get(), EquipmentTypes.AXE);
  event.add(Equipments.GLARE_BROADAXE.get(), EquipmentTypes.AXE);
  event.add(Equipments.GRAVEN_BROADAXE.get(), EquipmentTypes.AXE);
  event.add(Equipments.THUNDERCLAP.get(), EquipmentTypes.AXE);
  event.add(Equipments.VOLCANO_GREATAXE.get(), EquipmentTypes.AXE);
  event.add(Equipments.GREATAXE_OF_THE_SEA.get(), EquipmentTypes.AXE);
  event.add(Equipments.SHINING_BROADAXE.get(), EquipmentTypes.AXE);
  event.add(Equipments.BROADAXE_OF_THE_DEAD.get(), EquipmentTypes.AXE);
  event.add(Equipments.THUNDEROUS_ROAR.get(), EquipmentTypes.AXE);
  event.add(Equipments.THIEF_CAPE.get(), EquipmentTypes.NEUTRAL);
  event.add(Equipments.THIEF_SCARF.get(), EquipmentTypes.NEUTRAL);
  event.add(Equipments.WINGLY_MANTLE.get(), EquipmentTypes.NEUTRAL);
  }
}