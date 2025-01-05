import java.util.List;

/**
 * Iterator design pattern is used when we want to iterate over the collection of the objects
 * independent of the datatstructures that used to store the collection.
 * Also helps to seperate out the implementation details from the client.
 * 
 * there can  be more than one iterator and each of the iterators can be handle multiple types of objects as well.
 * 
 */

 class Book{
     String title;
     Book(String title){
         this.title = title;
     }
 }

 interface Iterator{
     Book next();
     boolean hasNext();
 }

 interface Iterable{
    Iterator getIterator();
 }

 class Library implements Iterable{
    List<Book> list;

    Library(List<Book> list){
        this.list = list;
    }

    public Iterator getIterator(){
        return new ListIterator(list);
    }
 }

 class ListIterator implements Iterator{
    List<Book> list;
    int index;

    ListIterator(List<Book> list){  
        this.list = list;   
    }

    public Book next(){
        if(hasNext())
            return list.get(index++);
        throw new IndexOutOfBoundsException();
    }

    public boolean hasNext(){
        return index < list.size();
    }
 }