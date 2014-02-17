package ru.go.vacuum.model.core

import ru.go.vacuum.model.AttributeItem
import ru.go.vacuum.model.Stuff
import ru.go.vacuum.model.StuffAttributes
import ru.go.vacuum.model.User

class SaleItem {

    Integer index
    Stuff stuff
    Integer count = 1
    List<AttributeItem> attributeItemList
    Map<User,Integer> userMap

    static constraints = {
    }

    public SaleItem(){
        this.attributeItemList = null
    }

    SaleItem addUser(User user, Integer count){
        if(userMap == null){
            userMap = new HashMap<User,Integer>();
        }
        // TODO корректные правила добавления количества - что если лимит уже исчерпан - то добавить низя
        // TODO должно идти сообщение
        if(count <= this.count){
            userMap.put(user, count)
        }

    }

    boolean equals(o) {
        if (this.is(o)) return true
        if (!(o instanceof SaleItem)) return false

        SaleItem saleItem = (SaleItem) o

        if (id != saleItem.id) return false
        if (stuff != saleItem.stuff) return false

        return true
    }

    int hashCode() {
        int result
        result = stuff.hashCode()
        result = 31 * result + id.hashCode()
        return result
    }

    @Override
    public java.lang.String toString() {
        return "\n\nSaleItem{" +
                "\nid=" + id +
                "\n, userList=" + userMap +
                "\n, index=" + index +
                "\n, stuff=" + stuff +
                "\n, count=" + count +
                "\n, attributeItemList=" + attributeItemList +
                "\n, version=" + version +
                '}';
    }
}
