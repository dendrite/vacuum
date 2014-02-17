package ru.go.vacuum.model

class AttributeItem {

    String name
    Object value
    TypeItem type

    static mapping = {
        type enumType: 'ordinal'
    }

    static constraints = {
    }

    public AttributeItem(){
        this.name = null;
        this.value = null;
        this.type = TypeItem.STRING
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

    public enum TypeItem {
        STRING(1),
        INTEGER(2),
        DOUBLE(3),
        IMAGE(4),
        BYTES(5)

        final int id

        private TypeItem(int id) { this.id = id }
    }
}
