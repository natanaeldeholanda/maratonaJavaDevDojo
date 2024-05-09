package academy.devdojo.maratonajava.javacore.ZZDoptional.dominio;

public class Manga {
    private Integer id;
    private String title;
    private String chapters;

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", chapters='" + chapters + '\'' +
                '}';
    }

    public Manga(Integer id, String title, String chapters) {
        this.id = id;
        this.title = title;
        this.chapters = chapters;
    }


    public String getChapters() {
        return chapters;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setChapters(String chapters) {
        this.chapters = chapters;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
