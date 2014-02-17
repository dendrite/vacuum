package ru.go.vacuum.model

class Stuff {

    String title
    String article

    Brand brand
    Price price

    String description

    StuffCategory type

    List<StuffAttributes> attributes

    User creator

    static constraints = {
    }

    public Stuff(){
        this.attributes = new ArrayList<StuffAttributes>()
    }

    Stuff addAttribute(StuffAttributes stuffAttributes){
        if(stuffAttributes){
            this.attributes.add stuffAttributes
        }
        return this
    }

    @Override
    public java.lang.String toString() {
        return "\n\nStuff{" +
                "\nid=" + id +
                "\n, title='" + title + '\'' +
                "\n, article='" + article + '\'' +
                "\n, brand=" + brand +
                "\n, price=" + price +
                "\n, description='" + description + '\'' +
                "\n, type=" + type +
                "\n, attributes=" + attributes +
                "\n, version=" + version +
                '}';
    }
}
