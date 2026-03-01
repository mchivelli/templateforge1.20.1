# Changelog

All notable changes to The Warborn Origins will be documented in this file.

## [0.1.0-alpha] - 2026-02-08

### Added

#### Origins
- **Wood Elf** - Nature-attuned forest dwellers with flower-based buffs and stealth in vegetation.
- **Moon Elf** - Nocturnal assassins with stealth mechanics, dodge chance, and water vulnerability.
- **High Elf** - Arcane scholars with magic resistance/damage bonuses and heavy armor penalties.
- **Goblin** - Short, cunning scavengers with gold gear bonuses, hunger/poison immunity, and luck.
- **Arachnae** - Tall spider-folk with wall climbing, web trapping, and spider neutrality.
- **Orc** - Towering brutes with sprint knockback, high jump, dash attack, and natural armor.
- **Dark Dwarf** - Cursed soul-fire dwarves with potion immunity, Smite vulnerability, soul healing, and chains of death.
- **Mountain Dwarf** - Stout miners with extra health, fortune bonus, sun sensitivity, and dwarven brew healing.
- **Wild Dwarf** - Wandering traders with better villager prices, blast vulnerability, night speed/weakness, and energy shockwave.
- **Siren** - Aquatic enchantresses with Dolphin's Grace and regen in water, weaker on land, and a mob-pacifying song.
- **Piglin Kind** - Nether-born fire warriors who feed on flames, are harmed by water, stronger in the Nether, and trade health for power.
- **Human** - Baseline vanilla gameplay with no special powers, advantages, or disadvantages.
- **Plague Victim** - Undead-aligned carrier with poison immunity, villager trade lockout, no sleep, and a poison cloud active ability.
- **Revenant** - Undead summoner with life-drain strikes, crop-harvest lockout, poison/wither immunity, Smite and starvation vulnerability.

#### Race Attributes
- **Vegetarian** (Wood Elf, Moon Elf, High Elf) - Eating meat causes Nausea, Poison, and Hunger.
- **Carnivore** (Goblin, Arachnae, Orc) - Eating plant-based food causes Nausea, Weakness, and Hunger.
- **Mine Faster** (Dark Dwarf, Mountain Dwarf, Wild Dwarf) - +30% mining speed.
- **Night Vision** (Siren, Piglin Kind) - Permanent Night Vision.
- **None** (Human, Plague Victim, Revenant) - No shared race attribute.

#### Wood Elf Powers
- Elven Stature - 1.2x height via Pehkui, persists through respawn.
- Nature's Veil - Invisibility and night vision while standing in vegetation, lingers 1.5s after leaving.
- Flammable - +50% fire, lava, and flame damage taken.
- Light on Feet - -50% fall damage.
- Flower Affinity - Carry 3+ of a flower type for passive effects (Speed, Strength, Water Breathing, Fire Resistance, Luck, Jump Boost, Regeneration). Max 2 simultaneous effects.
- Skinny - Slender elven physique.

#### Moon Elf Powers
- Lunar Stature - 1.15x height, 0.9x width via Pehkui (tall and slim).
- Nimble - 15% chance to dodge attacks, +10% movement speed.
- Moonlit Veil - Invisibility while sneaking at night. Stealth meter drains while active, refills when not sneaking.
- Night Strike - 2x bonus damage when attacking from stealth at night. Breaks invisibility and triggers cooldown.
- Assassin's Focus - -30% damage dealt when stealth meter is not full.
- Hydrophobia - 1 damage per second in water or rain. Aqua Affinity enchantment on helmet negates this.
- Fragile - -6 max health, +15% physical damage taken.
- Ethereal - Faint blue lunar glow on player model.

#### High Elf Powers
- Arcane Stature - 1.15x height, 0.9x width via Pehkui (tall and slim).
- Fragile - -4 max health, +20% physical damage taken.
- Arcane Mastery - +20% magic resistance, +25% magic damage dealt. Compatible with Iron's Spells and other magic mods.
- Encumbered - -10% movement speed per heavy armor piece (iron, diamond, netherite). Feather Falling enchantment on boots negates all penalties.
- Arcane Surge - Active ability granting Regeneration II and Resistance I. Requires holding a magical catalyst (Amethyst Shard, Ender Pearl, Blaze Rod, Nether Star, End Crystal). 20s cooldown.
- Ethereal - Faint purple-blue magical shimmer on player model.

#### Goblin Powers
- Goblin Stature - 0.75x height, 0.85x width via Pehkui (short and skinny).
- Gold Affinity - Gold weapons gain +4 attack damage and +0.5 attack speed. Gold armor gains +4 armor and +2 armor toughness. Effectively netherite tier.
- Haggler - Villagers charge significantly higher prices.
- Iron Stomach - Immune to Hunger and Poison effects.
- Lucky Fingers - Passive Luck I attribute. Active ability: Luck III burst for 15s (30s cooldown).
- Skinny - -4 max health.

#### Arachnae Powers
- Arachnid Stature - 1.2x height, 0.95x width via Pehkui (tall and spindly).
- Wall Climber - Climb walls by walking into them. Hold sneak to cling in place.
- Arthropod Bane - +50% damage taken from Bane of Arthropods enchanted weapons.
- Spider Friend - Spiders and Cave Spiders are passive towards you.
- Master of Webs - Hitting enemies places cobwebs at their position (8s cooldown).
- Web Walker - Not slowed by cobwebs.

#### Orc Powers
- Orc Stature - 1.25x height, 1.15x width via Pehkui (tall and broad).
- Battering Ram - +100% knockback and +30% attack damage while sprinting.
- Ravenous - Hunger depletes 50% faster.
- Powerful Legs - +75% jump/step height (approximately 2 blocks).
- Dashing Supremacy - Active ability: Charge forward with Speed III, Resistance I, dealing 4 AoE damage and Slowness to nearby enemies (15s cooldown, must be sprinting to activate).
- Tough Skin - +4 natural armor, -10% movement speed.

#### Dark Dwarf Powers
- Dark Stature - 0.85x height, 1.05x width via Pehkui (short and stocky).
- Soul Mending - Regeneration I when within 8 blocks of soul light sources (Soul Torch, Soul Lantern, Soul Campfire).
- Cursed - +75% damage from Smite-enchanted weapons.
- Potion Immunity - Immune to all potion effects (positive and negative).
- Chains of Death - Active ability: Wither II + 4 magic damage to nearby enemies. Hold Shift for explosive variant (6 damage + explosion effects). 20s cooldown.

#### Mountain Dwarf Powers
- Mountain Stature - 0.8x height, 1.1x width via Pehkui (short and broad).
- Hardy - +6 max health (3 extra hearts).
- Fortune Born - Permanent Luck II (affects ore drops and loot tables).
- Dense Body - Cannot swim, sinks in water, -70% swim speed, Slowness while submerged.
- Sun Sensitivity - 1 damage every 2s in direct sunlight. Wearing any helmet protects.
- Dwarven Brew - Active ability: Instant Health II, Absorption I (10s), Saturation. 25s cooldown.

#### Wild Dwarf Powers
- Wild Stature - 0.85x height via Pehkui (short and nimble).
- Born Trader - Permanent Hero of the Village I (better villager trade prices).
- Blast Vulnerable - +20% explosion damage taken.
- Nocturnal Surge - Night: +20% movement speed and Weakness I. Holding a shield negates weakness but removes speed bonus.
- Energy Shockwave - Active ability: Push all enemies within 5 blocks back, dealing 3 damage + Slowness II. 18s cooldown.

#### Siren Powers
- Siren Stature - 0.9x width via Pehkui (slender, graceful form).
- Aquatic Grace - In water: Dolphin's Grace, Regeneration I, Water Breathing.
- Land Weakness - On land: -15% movement speed, -20% attack damage.
- Siren's Charm - Permanent Hero of the Village I (better villager trade prices).
- Siren's Song - Active ability: Pacify hostile mobs within 10 blocks with Slowness V + Weakness III for 8s. 30s cooldown.

#### Piglin Kind Powers
- Piglin Stature - 1.05x height, 1.05x width via Pehkui.
- Fire Resistant - Permanent Fire Resistance (immune to all fire and lava damage).
- Fire Hunger - Standing in fire or lava restores hunger (Saturation).
- Hydrophobia - 1 damage every 1.5s in water or rain. Aqua Affinity enchantment on helmet negates.
- Nether Strength - Nether: +25% attack damage, +10% speed. Overworld: -15% attack damage, -10% speed.
- Unholy Deal - Active ability: Sacrifice 4 health for Strength II (15s) and Speed I (10s). Requires >6 health. 20s cooldown.

#### Human
- No powers (intended vanilla baseline origin).

#### Plague Victim Powers
- Undead Nature - Counted as undead (undead mobs are non-hostile by default).
- Plague Immunity - Immune to Poison.
- Contagious - Villagers refuse to trade.
- Insomniac - Cannot sleep, but can still set spawn point.
- Poison Cloud - Active ability: AoE poison + magic damage around the player. 25s cooldown.

#### Revenant Powers
- Undead Nature - Counted as undead.
- Essence Extraction - On hit, deals bonus magic damage to living non-undead and grants brief Absorption.
- Black Thumb - Cannot harvest crops.
- Necrotic Resilience - Immune to Poison and Wither.
- Consecrated Weakness - +60% damage from Smite-enchanted weapons.
- Starved Husk - +100% starvation damage.
- Disturbed - Cannot sleep, but can still set spawn point.
- Revenance - Active ability: Summon a zombie and skeleton servant. 35s cooldown.

#### Pehkui Integration
- 11 of 14 origins use Pehkui for height and width scaling.
- Scales persist through respawn via mcfunction files.
- Scales properly reset when an origin is changed or removed.

#### Tags
- `warbornorigins:meat` - Meat items for Vegetarian detection.
- `warbornorigins:vegetarian_food` - Plant-based food items for Carnivore detection.
- `warbornorigins:heavy_armor` - Iron, diamond, and netherite armor for Encumbered detection.
- `warbornorigins:gold_gear` - Gold tools and armor for Gold Affinity detection.
- `warbornorigins:is_magic` - Magic damage types for Arcane Mastery compatibility with Iron's Spells and other magic mods.

### Performance
- All `action_over_time` powers use `interval >= 4` (no per-tick polling).
- Stature persist safety checks at `interval=200` (10s) instead of per-second.
- Conditional guards on cooldown tickers to skip no-op ticks.
- Attribute-based modifiers preferred over repeated command execution.
- Event-driven actions (action_on_hit, action_on_item_use, active_self) preferred over polling.
- Proper cleanup on `entity_action_lost` for all stature powers.
- Flower Affinity effect duration set to 4s with 3s (60 tick) interval for overlap buffer.
- Hydrophobia particle interval at 20 ticks to reduce command overhead.
