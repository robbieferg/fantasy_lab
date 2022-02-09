package Players;

import Enemies.Enemy;
import Players.Spells.Spells;

public interface ISpell {
    void cast(Enemy enemy, Spells spell);
}
