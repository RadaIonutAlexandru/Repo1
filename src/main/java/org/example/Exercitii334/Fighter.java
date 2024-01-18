package org.example.Exercitii334;

public class Fighter {
    class fighter {
        public String toString() {
            return "Fighter is a " + getClass().getSimpleName();
        }

        public boolean isVulnerable() {
            return false;
        }

        public int damagePoints(fighter opponent) {
            return 0;
        }
    }

    class Warrior extends fighter {
        @Override
        public int damagePoints(fighter opponent) {
            if (opponent.isVulnerable()) {
                return 10;
            } else {
                return 6;
            }
        }
    }

    class Wizard extends fighter {
        private boolean spellPrepared;

        public void prepareSpell() {
            spellPrepared = true;
        }

        @Override
        public boolean isVulnerable() {
            return !spellPrepared;
        }

        @Override
        public int damagePoints(fighter opponent) {
            if (spellPrepared) {
                return 12;
            } else {
                return 3;
            }
        }
    }

    public class Main {
        public void main(String[] args) {
            fighter warrior = new Warrior();
            fighter wizard = new Wizard();

            System.out.println(warrior);  // "Fighter is a Warrior"
            System.out.println(warrior.isVulnerable());  // false

            System.out.println(wizard);  // "Fighter is a Wizard"
            System.out.println(wizard.isVulnerable());  // true

            ((Wizard) wizard).prepareSpell();
            System.out.println(wizard.isVulnerable());  // false

            System.out.println(warrior.damagePoints(wizard));  // 10
            System.out.println(((Wizard) wizard).damagePoints(warrior));  // 12
        }
    }
}
