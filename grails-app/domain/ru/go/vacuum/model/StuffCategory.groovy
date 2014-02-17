package ru.go.vacuum.model

class StuffCategory {

    String name
    String description

    static constraints = {
    }

    boolean equals(o) {
        if (this.is(o)) return true
        if (!(o instanceof StuffCategory)) return false

        StuffCategory stuffType = (StuffCategory) o

        if (id != stuffType.id) return false
        if (name != stuffType.name) return false

        return true
    }

    int hashCode() {
        int result
        result = name.hashCode()
        result = 31 * result + id.hashCode()
        return result
    }
}
