package ru.go.vacuum.model

class StuffAttributes {

    String title
    StuffCategory type
    StuffAttributes parent


    String description

    AttributeItem.Type attributeType = AttributeItem.Type.STRING

    List<AttributeItem> attributes

    static constraints = {
    }

    public StuffAttributes(){
        parent = null
        this.attributes = new ArrayList<AttributeItem>()
    }

    boolean isRoot(){
        return parent == null
    }

    StuffAttributes add(AttributeItem attributeItem) {
        if (attributeItem.type == attributeType) {
            attributes.add attributeItem
        }
        return this
    }


    @Override
    public java.lang.String toString() {
        return "\n\nStuffAttributes{" +
                "\nid=" + id +
                "\n, title='" + title + '\'' +
                "\n, type=" + type +
                "\n, description='" + description + '\'' +
                "\n, attributeType=" + attributeType +
                "\n, attributes=" + attributes +
                "\n, version=" + version +
                '}';
    }
}
