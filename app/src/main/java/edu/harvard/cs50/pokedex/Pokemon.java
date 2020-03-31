package edu.harvard.cs50.pokedex;

public class Pokemon {
    private String name;
    private String url;
    private boolean isActive;

    Pokemon(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
    
    public boolean getStatus() {
        return this.isActive;
    }
    
    public void setStatus(boolean isActive) {
        this.isActive = isActive;
    }
}
