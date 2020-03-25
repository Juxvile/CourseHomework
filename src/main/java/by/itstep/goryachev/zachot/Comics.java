package by.itstep.goryachev.zachot;

//Создать приложение «Магазин комиксов».
//        Основная задача проекта: учитывать текущий ассортимент комиксов в магазине.
//        Необходимо хранить следующую информацию о комиксах: название комикса,
//        ФИО художника/автора, название издательства комикса, количество страниц,
//        жанр, год издания, себестоимость, цена для продажи, является ли комикс продолжением какого-то другого комикса или серии комиксов.
//        Приложение должно позволять: добавлять комиксы, удалять комиксы, редактировать параметры комиксов, продавать комиксы, списывать комиксы, вносить
//        комиксы в акции (например, неделя комиксов новогодней тематики со скидкой
//        10% или скидки к черной пятнице), откладывать комиксы для конкретного покупателя. Приложение должно предоставить функциональность по поиску комиксов
//        по таким параметрам: название комикса, художник/автор, жанр. Приложение
//        должно предоставлять возможность просмотреть список новинок, список самых
//        продаваемых комиксов, список самых популярных художников/авторов, список
//        самых популярных жанров по итогам дня, недели, месяца, года.
//        Информация из приложения должна сохраняться и загружаться из файлов.
//        Необходимо предусмотреть возможность входа по логину и паролю.


//                FileInputStream fileInputStream = new FileInputStream("Comics.txt");
//                ObjectInputStream showcomics= new ObjectInputStream(fileInputStream);
//                Comics comicsInp = (Comics) showcomics.readObject();
//                System.out.println(thisnewcomics.getName() + " " + thisnewcomics.getAutorname() + " " + thisnewcomics.getPublishing() + " ");
//                showcomics.close();
//                break;

import java.io.Serializable;

public class Comics implements Serializable{
    private String name;
    private String autorname;
    private String publishing;
    private int page;
    private String genre;
    private int ageofpublishing;
    private int costprice;
    private int price;
    private boolean tobecontinue;

    public Comics() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutorname() {
        return autorname;
    }

    public void setAutorname(String autorname) {
        this.autorname = autorname;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAgeofpublishing() {
        return ageofpublishing;
    }

    public void setAgeofpublishing(int ageofpublishing) {
        this.ageofpublishing = ageofpublishing;
    }

    public int getCostprice() {
        return costprice;
    }

    public void setCostprice(int costprice) {
        this.costprice = costprice;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isTobecontinue() {
        return tobecontinue;
    }

    public void setTobecontinue(boolean tobecontinue) {
        this.tobecontinue = tobecontinue;
    }

    public Comics(String name, String autorname, String publishing, int page, String genre, int ageofpublishing, int costprice, int price, boolean tobecontinue) {

        this.name = name;
        this.autorname = autorname;
        this.publishing = publishing;
        this.page = page;
        this.genre = genre;
        this.ageofpublishing = ageofpublishing;
        this.costprice = costprice;
        this.price = price;
        this.tobecontinue = tobecontinue;
    }
}
