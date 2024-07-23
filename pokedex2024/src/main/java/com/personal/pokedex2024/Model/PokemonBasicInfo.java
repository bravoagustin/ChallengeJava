package com.personal.pokedex2024.Model;

import java.util.List;

public class PokemonBasicInfo {
    private int id;
    private String name;
    private int weight;
    private List<TypeWrapper> types;
    private List<AbilityWrapper> abilities;
    private Sprites sprites;

    // Getters y Setters ------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<TypeWrapper> getTypes() {
        return types;
    }

    public void setTypes(List<TypeWrapper> types) {
        this.types = types;
    }

    public List<AbilityWrapper> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<AbilityWrapper> abilities) {
        this.abilities = abilities;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    //-------------------------------------------------------------------------------------------------------------
    public static class TypeWrapper {
        private Type type;

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }
    }

    public static class Type {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class AbilityWrapper {
        private Ability ability;

        public Ability getAbility() {
            return ability;
        }

        public void setAbility(Ability ability) {
            this.ability = ability;
        }
    }

    public static class Ability {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Sprites {
        private String front_default;

        public String getFront_default() {
            return front_default;
        }

        public void setFront_default(String front_default) {
            this.front_default = front_default;
        }
    }
}

