package ru.go.vacuum.model

class AttributeItem {

    String name
    Object value
    Type type

    public AttributeItem(){
        this.name = null;
        this.value = null;
        this.type = Type.STRING
    }

    static constraints = {
    }

    boolean equals(o) {
        if (this.is(o)) return true
        if (!(o instanceof AttributeItem)) return false

        AttributeItem that = (AttributeItem) o

        if (id != that.id) return false
        if (name != that.name) return false
        if (type != that.type) return false
        if (value != that.value) return false

        return true
    }

    int hashCode() {
        int result
        result = (name != null ? name.hashCode() : 0)
        result = 31 * result + (value != null ? value.hashCode() : 0)
        result = 31 * result + type.hashCode()
        result = 31 * result + id.hashCode()
        return result
    }

    @Override
    public java.lang.String toString() {
        return "\nAttributeItem{" +
                "\nid=" + id +
                "\n, name='" + name + '\'' +
                "\n, value=" + value +
                "\n, type=" + type +
                "\n, version=" + version +
                '}';
    }

    enum Type{
        STRING, INTEGER, DOUBLE, IMAGE, BYTES
    }
}
