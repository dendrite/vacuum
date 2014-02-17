package ru.go.vacuum.model.core

import ru.go.vacuum.model.AttributeItem
import ru.go.vacuum.model.Stuff
import ru.go.vacuum.model.StuffAttributes
import ru.go.vacuum.model.User

class Sale {

    String title
    List<SaleItem> saleItems

    public Sale(){
        this.saleItems = new ArrayList<SaleItem>()
    }

    Sale add(Stuff stuff, List<AttributeItem> attributeItemList){
        int index = this.saleItems.size()

        def saleItem = new SaleItem()
        saleItem.stuff = stuff
        saleItem.attributeItemList = attributeItemList
        saleItem.count = 1
        saleItem.index = index

        this.saleItems.add saleItem

        return this
    }

    /**
     * Это добавляет продавец
     *
     * @param stuff
     * @param attributeItemList
     * @param count
     * @return
     */
    Sale add(Stuff stuff, List<AttributeItem> attributeItemList, Integer count){
        int index = this.saleItems.size()

        def saleItem = new SaleItem()
        saleItem.stuff = stuff
        saleItem.attributeItemList = attributeItemList
        saleItem.count = count
        saleItem.index = index

        this.saleItems.add saleItem

        return this
    }

    /**
     * Это добавляет покупатель
     *
     * @param user
     * @param count
     * @param saleItem
     * @return
     */
    Sale buy(User user, Integer count, SaleItem saleItem){

        if(this.saleItems.contains(saleItem)){

            int index = this.saleItems.indexOf(saleItem)
            this.saleItems.get(index).addUser(user, count)
        }

        return this
    }

    static constraints = {
    }

    @Override
    public java.lang.String toString() {
        return "Sale{" +
                "\nid=" + id +
                "\n, title='" + title + '\'' +
                "\n, saleItems=" + saleItems +
                "\n, version=" + version +
                '}';
    }
}
