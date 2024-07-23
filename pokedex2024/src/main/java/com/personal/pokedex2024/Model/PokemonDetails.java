package com.personal.pokedex2024.Model;

import java.util.List;

public class PokemonDetails {
    private List<FlavorTextEntry> flavor_text_entries;
    private List<Move> moves;
    public List<FlavorTextEntry> getFlavor_text_entries() {
        return flavor_text_entries;
    }

    public void setFlavor_text_entries(List<FlavorTextEntry> flavor_text_entries) {
        this.flavor_text_entries = flavor_text_entries;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public static class FlavorTextEntry {
        private String flavor_text;
        private Language language;

        public String getFlavor_text() {
            return flavor_text;
        }

        public void setFlavor_text(String flavor_text) {
            this.flavor_text = flavor_text;
        }

        public Language getLanguage() {
            return language;
        }

        public void setLanguage(Language language) {
            this.language = language;
        }
    }

    public static class Language {
        private String name;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Move {
        private MoveDetails move;
        public MoveDetails getMove() {
            return move;
        }

        public void setMove(MoveDetails move) {
            this.move = move;
        }
    }

    public static class MoveDetails {
        private String name;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

