package id.ac.polinema.recyclerviewsangatsederhana.models;

public class SuperHero {
    public String heroName;
    public int imgUrl;

    public SuperHero(String heroName, int imgUrl) {
        this.heroName = heroName;
        this.imgUrl = imgUrl;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setImgUrl(int imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getImgUrl() {
        return imgUrl;
    }
}
