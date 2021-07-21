
- [**Proprietà generali OOP:**](#proprietà-generali-oop)
  - [**Cos'è una classe**](#cosè-una-classe)
  - [**Encapsulation (Incapsulamento)**](#encapsulation-incapsulamento)
  - [**Inheritance (Ereditarietà)**](#inheritance-ereditarietà)
  - [**Polymorfism (Polimorfismo)**](#polymorfism-polimorfismo)
- [**Java**](#java)
  - [**Basics**](#basics)
    - [**Strings**](#strings)
    - [**Arrays**](#arrays)
      - [**Dinamico**](#dinamico)
      - [**Statico**](#statico)
      - [**Multidimensionale**](#multidimensionale)
      - [**Metodi**](#metodi)
  - [**JCF (Java Collection Framework)**](#jcf-java-collection-framework)
    - [**Array Ridimensionabile**](#array-ridimensionabile)
    - [**Linked List**](#linked-list)
    - [**Albero Bilanciato**](#albero-bilanciato)
    - [**Strutture dati common**](#strutture-dati-common)
      - [**List**](#list)
        - [**ArrayList**](#arraylist)
        - [**LinkedList**](#linkedlist)
      - [**Set**](#set)
        - [**HashSet**](#hashset)
        - [**LinkedHashSet**](#linkedhashset)
        - [**TreeSet**](#treeset)
      - [**Map**](#map)
        - [**HashMap**](#hashmap)
        - [**LinkedHashMap**](#linkedhashmap)
        - [**TreeMap**](#treemap)
  - [**Generics**](#generics)
    - [**Perchè sono state introdotte in Java 5**](#perchè-sono-state-introdotte-in-java-5)
    - [**La wildcard ? e il sub-typing**](#la-wildcard--e-il-sub-typing)
  - [**Exceptions**](#exceptions)
    - [**Cosa sono**](#cosa-sono)
    - [**Checked & Unchecked**](#checked--unchecked)
    - [**Generazione di un exception con throw**](#generazione-di-un-exception-con-throw)
    - [**Tipi di Delega**](#tipi-di-delega)
      - [**Assente**](#assente)
      - [**Completa**](#completa)
      - [**Parziale**](#parziale)
    - [**Finally**](#finally)
  - [**I/O Framework**](#io-framework)
  - [**Threads**](#threads)
    - [**Gestione**](#gestione)
    - [**Creazione**](#creazione)
    - [**Avvio**](#avvio)
    - [**Priorità**](#priorità)
    - [**Stati Thread**](#stati-thread)
      - [*Running*](#running)
      - [*Runnable*](#runnable)
      - [*Waiting*](#waiting)
      - [*Blocking*](#blocking)
      - [*Sleeping*](#sleeping)
    - [**Sincronizzazione**](#sincronizzazione)
      - [**Come funziona**](#come-funziona)
      - [**Implementazioni**](#implementazioni)
        - [*`Esplicita`*](#esplicita)
        - [*`Classe thread-safe`*](#classe-thread-safe)
    - [**Metodi Thread**](#metodi-thread)
      - [*yield()*](#yield)
      - [*wait()*](#wait)
      - [*notify()*](#notify)
  - [**Altri Concetti OOP**](#altri-concetti-oop)
    - [**Static e Dynamic Binding**](#static-e-dynamic-binding)
      - [*Static*](#static)
      - [*Dynamic*](#dynamic)
    - [**Overloading**](#overloading)
    - [**Costruttore**](#costruttore)
    - [**Wrapper**](#wrapper)
    - [**this**](#this)
    - [**super**](#super)
    - [**Abstract method**](#abstract-method)
    - [**Abstract class**](#abstract-class)
    - [**Interfacce**](#interfacce)
    - [**Iterable & Iterator**](#iterable--iterator)
    - [**Vocabulary**](#vocabulary)

# **Proprietà generali OOP:**

## **Cos'è una classe**

Una classe rappresenta l astrazione e la definizione di un oggetto, include le variabili, Il costruttore, distruttore e metodi relativi a quella classe.
## **Encapsulation (Incapsulamento)**

Ogni oggetto incapsula il codice (dati e metodi che lo riguardano) in se stesso (wrapping). In questo modo vengono introdotti fattori di sicurezza e diventa molto più semplice rilevare errori/bug siccome le variabili interessate vengono utilizzate solo nella classe dove sono incapsulate.


## **Inheritance (Ereditarietà)**

Una classe può essere definita un estensione di un altra, questa eredita tutti i dati e metodi della parent ma ovviamente può aggiungerne di altri o fare altre specializzazioni. Questo principio permette un grande riutilizzo di codice già scritto.


## **Polymorfism (Polimorfismo)**

La richiesta di un medesimo metodo può portare a comportamenti differenti. Questo perchè possiamo definire diversi comportamenti in base a fattori come:

    -   Quale oggetto chiama quel metodo
    -   Tipi di parametri (default etc..)
    -   Contesto...

# **Java**

## **Basics**


### **Strings**

Le Stringhe in Java sono immutabili, se vengono rilevate due stringhe di stesso valore dalla JVM allora avranno la stessa reference.

```
String a = " hello ";
String b = " hello ";

a == b -> true
```    

Questo può essere bypassato con `new`:

```
String a = new String (" hello ");
String b = new String (" hello ");

a == b -> false
```

### **Arrays**


#### **Dinamico**
Un array è di fatto un oggetto ed è immagazzinato nell' Heap, per inizializzarlo è obbligatorio utilizzare `new`

```
int[] arr = new int[512];
```

#### **Statico**

```
int[] arr = {1,2,3,4,5};
```

#### **Multidimensionale**

Di interi (o comunque tipi primitivi):
```
int[][] matrix = new int[512][512];
```
Di oggetti:

```
Car[][] table = new Car[][];
table[0][1] = "Opel" 
```

#### **Metodi**

```
binarySearch()
fill()
sort()
toString()
asList()
arrayCopy()
```

## **JCF (Java Collection Framework)**
 Un set che prevede interfacce, algoritmi, classi e classi astratte

### **Array Ridimensionabile**
Ogni volta che va in overflow aumenta la sua dimensione in potenze di 2

### **Linked List**
Una lista dinamica dove ogni nodo contiene il prossimo nodo e l informazione de nodo corrente

### **Albero Bilanciato**

Un albero di ricerca bilanciato è definito tale quando il sotto albero sinistro e destro non differiscono per più di 1 nella profondità. Un albero completo è bilanciato, non viceversa. Questo garantisce complessità di O(logn)


### **Strutture dati common**

#### **List**
```
List<Integer> l = new ArrayList<Integer>();
l.add(14);
l.add(73);
l.add(18);
```

##### **ArrayList**
##### **LinkedList**


#### **Set**

```
Set<Integer> my_collect = new HashSet<>();

```


##### **HashSet**

Utilizza il protocollo hashmap avendo come chiave il valore dato da noi e come valore un booleano PRESENT o null.

- Estende Set
- Non ricorda l ordine d inserimento
- Assicura l unicità non ammettendo duplcati
- Molto rapido
- Non ordinato
##### **LinkedHashSet**
- Estende HashSet
- Ricorda l ordine d inserimento
- Assicura l unicità non ammettendo duplcati
- Non ordinato
##### **TreeSet**
- Estende SortedSet
- Assicura l unicità non ammettendo duplcati
- E' naturalmente ordinato in modo crescente (modificabile)
- E' più lento dei set basati su Hash.

#### **Map**

Un interfaccia che si occupa di salvare coppie chiave-valore dove la chiave deve essere unica e devono essere entrambi degli Oggetti.

##### **HashMap**
- Implementa Map
- Non ricorda l ordine di inserimento
- Se non consideriamo le collisioni prevede un tempo costante O(1)


```
Map<String, Integer> m = new HashMap<String, Integer>();
		
m.put(“Agata”,  2); 
m.put(“Marzia”, 3);
m.put(“Agata”,  4); 
m.put(“Nicola”, 1);
		
System.out.println(m);    
{Agata=4, Nicola=1, Marzia=3}


// looping keys and accessing values
Set<String> keys = m.keySet();
for(String key : keys) {
	System.out.println(key + " -> " + m.get(key));
}



// contains key
if (m.containsKey(key)) {
	System.out.println(m.get(key));

```

##### **LinkedHashMap**
- Estende HashMap
- Ricorda l ordine di inserimento

##### **TreeMap**
- Implementa SortedMap
- L utente definisce il sorting interno
- La più lenta tra tutte

## **Generics**
### **Perchè sono state introdotte in Java 5**
Le Generics sono state introdotte per permettere un controllo sul tipo durante la compilazione e non al runtime. Questo ha portato alla riscrittura di tutto il JCF per evitare le ClassCastException

`SENZA`

```
List My_Fruit_Bucket = new ArrayList();
My_Fruit_Bucket.add(new Fruit("Mela"));
My_Fruit_Bucket.add(new Vegetable("Mela"));

Fruit my_indexed_fruit = (Fruit) My_Fruit_Bucket.get(0); // OK cast Object to Fruit

// Fruit my_indexed_fruit = (Fruit) My_Fruit_Bucket.get(1); CLASS CAST EXCEPTION Vegetable
```

`CON`
```
List<Fruit> My_Generics_Bucket = new ArrayList();
// My_Generics_Bucket.add(new Vegetable("Spinach")); COMPILER ERROR
```

### **La wildcard ? e il sub-typing**

La wildcard può avere limiti superiori e inferiori:
- Avendo `List<? extends Fruit>` è una lista di oggetti sconosciuti ma sono tutti ALMENO dei Frutti (della classe dei frutti).

- Avendo `List<? super Fruit>` è una lista di oggetti sconosciuti ma sono tutti AL MASSIMO Frutti.


## **Exceptions**
### **Cosa sono**
Le eccezioni permettono di dare dei nomi ai problemi che si verificano (così evitando ritorni numerici non mantenibili), permettono la delega e di poter gestire l eccezione quando viene intercettata.
Queste sono parallele agli Errori (che possono essere errori di linking o della vm di java.

### **Checked & Unchecked**

Le eccezioni checked sono quel tipo di eccezioni che è obbligatorio andare a controllare e quindi wrappare con il try/catch (per esempio quando si opera con i File sono quasi sempre checked come `FileNotFoundException`).
Per quelle unchecked invece non è obbligatorio fare il controllo try/catch altrimenti il codice diventerebbe bloated di controlli (esempio `divisionbyzero`, `ArithmeticException`, ,`ArrayIndexOutOfBound`, `NullPointerException`)

### **Generazione di un exception con throw**
```
public class ArrayList<E> extends AbstractList<E> {
…
  public E get(int index) {
    rangeCheck(index);
    return elementData(index);
  }

  private void rangeCheck(int index) {
    if (index >= size) throw new   IndexOutOfBoundsException(outOfBoundsMsg(index));
  }
  …
}
```
### **Tipi di Delega**

#### **Assente**

Avviene il throw dell exception quando viene rilevata e nel punto in cui viene rilevata

```
public class ArrayList<E> extends AbstractList<E> {
…
  public E get(int index) {
    rangeCheck(index);
    return elementData(index);
  }

  private void rangeCheck(int index) {
    if (index >= size) throw new   IndexOutOfBoundsException(outOfBoundsMsg(index));
  }
  …
}
```

#### **Completa**
Il throw viene delegato al metodo

```
/* foo() delegates IOException */
class Dummy {
	public void foo() throws IOException {
		char[] v = new char[256];
		FileReader f = new FileReader("test.txt");
		f.read(v);
		f.close();
	}
}

/* main() intercepts IOException */
class App {
	public static void main (String args[]) {
		try {
			new Dummy().foo();
		} catch (IOException e) { /* do something */ }
	}
```
#### **Parziale**
Viene rilevata l exception ma viene cambiata e lanciata un altra eccezione di un altro tipo.

### **Finally**

Permette di scrivere del codice che viene eseguito in tutti i casi.

```
try{

}catch{

}finally{

}
```


## **I/O Framework**


## **Threads**

I thread volgarmente possiamo considerarli processi più semplici, hanno il loro program counter, le loro variabili e il loro indirizzo di memoria, anche se in realtà non sono dei veri e propri processi perchè più thread sotto lo stesso processo possono anche comunicare tra di loro. La gestione multi-thread però non è banale ma possono permettere delle operazioni in semi-parallelismo.


### **Gestione**
Qualsiasi programma Java deve avere almeno un thread: il Main.
Il sistema operativo utilizza un componente contenuto nel Kernel: lo *`scheduler`*. Questo assegna la cpu ai rispettivi processi/thread.

### **Creazione**

Ci sono due modi per creare un thread:

- `Estendere la classe Thread
`
<br>
<br>

  ```
  Class T extends Thread {
  public void run() {
  		//code here   
  	}
  }
  T t = new T(); 
  t.start(); 
  ```
<br>

- `Implementare l interfaccia nel suo metodo run()
`
<br>
<br>
    ```
    Class R implements Runnable {
    	public void run() {
    		//code here   
    	}
    }
    Thread t = new Thread(new R());
    t.start(); 
    ```

### **Avvio**

Quando un thread viene creato questo comunque non viene eseguito fino a quando il comando start() come metodo non viene chiamato (può essere avviato una sola volta altrimenti tirerà una RuntimeException).

```
public class Runner{
	public static void main(String[] args) {
		Thread t1 = new Thread(new Counter(), “T_A”);
		Thread t2 = new Thread(new Counter(), “T_B”);
		Thread t3 = new Thread(new Counter(), “T_C”);
		t1.start(); t2.start(); t3.start();
	}
}
```
### **Priorità**

Quando i thread vengono startati non si è certi sull' ordine, difatti non è detto che vengano avviati con l ordine per il quale noi chiamiamo il loro metodo start().
Per questo possiamo definire delle priorità (valore tra 1-10).

```
Thread t = new Thread(new Runnable()); 
t.setPriority(Thread.MAX_PRIORITY);	
t.start();
```

### **Stati Thread**

#### *Running*
#### *Runnable*

#### *Waiting*
 
#### *Blocking*
#### *Sleeping*


### **Sincronizzazione**

#### **Come funziona**

Siccome è possibile che i thread condividano dati o oggetti è possibile andare a sincronizzare i thread. Questo significa andare a bloccare un dato e renderlo disponibile a un unico thread alla volta, così da evitare inconsistenza, questa operazione va fatta solo sui dati per cui il multi thread ne romperebbe la consistenza.

#### **Implementazioni**

##### *`Esplicita`*
<br>


```
   public void run() {
        while (true) {
            synchronized (account) {
                int amount = rnd.nextInt(100);

                if (account.getBalance() < amount) {
                    System.out.printf("%s quitting [balance=%d, amount=%d]\n", Thread.currentThread().getName(),
                            account.getBalance(), amount);
                    break;
                }
            }
        }
   }
```
##### *`Classe thread-safe`*
è una classe safe per l accesso multi thread
<br>

```
public class SharedResource {
    public synchronized void A() {
        System.out.println(Thread.currentThread().getName() + " A()");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void B() {
        System.out.println(Thread.currentThread().getName() + " B()");
    }

    public void C() {
        System.out.println(Thread.currentThread().getName() + " C()");
    }

}
```

### **Metodi Thread**

#### *yield()*
Fa tornare il thread nello stato Runnable.
#### *wait()*
può essere chiamata solo da un blocco sincronizzato, rimuove il lock e permette ad un altro thread di arrivare e acquisire il lock.
#### *notify()*
Invia una notifica ad uno dei thread interessati, esiste anche notifyAll().


## **Altri Concetti OOP**

### **Static e Dynamic Binding**

#### *Static*
Lo Static Binding avviene quando è presente un metodo statico, per esempio data una classe `Car` possiamo avere un metodo "kmh to mph" statico che converte la velocità anche senza nessun oggetto creato.
Nello statico sappiamo nella fase di compilazione il tipo di un oggetto

```
class Dog{  
 private void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Dog d1=new Dog();  
  d1.eat();  
 }  
}  
```

#### *Dynamic*
In quello dinamico il binding oggetto-tipo lo sapremo solo al Runtime

```
class Animal{  
 void eat(){System.out.println("animal is eating...");}  
}  
  
class Dog extends Animal{  
 void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Animal a=new Dog();  
  a.eat();  
 }  
}  
```
### **Overloading**

Un metodo non è univocamente identificato dal nome bensì dal suo nome + la lista dei parametri, questo significa che ci possono essere più metodi con il medesimo nome ma che accettano parametri diversi e si comportano quindi in metodi diversi. Questa è definita `signature` e permette l Overloading.


### **Costruttore**

Questo codice viene eseguito ogni volta che viene inizializzato un oggetto di quella classe, include anche l inizializzazione dei dati; è possibile avere Overloading di Costruttori.

### **Wrapper**

Le classi wrapper dei tipi primitivi (come `Integer` per int) permettono di avere dei metodi accessibili per quei specifici tipi.
E' possibile anche convertire una primitiva ad una wrapper e vicerversa.

### **this**

This è una reference all'oggetto corrente

### **super**

Super si riferisce alla classe padre

### **Abstract method**

Un metodo che è stato definito ma NON inizializzato è definito un metodo `Abstract`

### **Abstract class**

Una classe che contiene almeno un metodo Abstract è definita come classe Abstract

```
abstract class MyClass {
    ...
  }
```

### **Interfacce**

```
interface calculus{
    public float Somma();
    public float Sottrazione();
    public float Divisione();
    public float Moltiplicazione();
}

class my_calc implements calculus{

  // ...

}
```

Un interfaccia è una classe che ci permette di dichiarare metodi senza implementarne il codice.
  - questi metodi sono pubblici ed astratti di default
  - non è possibile inizializzare un interfaccia
  - se una classe implementa un interfaccia deve andare a definire tutti quanti i suoi metodi, è possibile implementarla parzialmente rendendo quei metodi Abstract
  - è possibile specializzare le interfacce
  - è possibile implementare più interfacce ma non estendere più di una classe


### **Iterable & Iterator**
`Iterable` è un interfaccia di Java è sta a significare che è possibile iterare su quell oggetto (con un for each), ovvero che un `Iteratore viene restituito`.

  
### **Vocabulary**

 - ***abstract method:*** a method which is declared but not defined (it has no method body)
 - ***abstract class:*** a class which either (1) contains abstract methods, or (2) has been declared abstract
 - ***instantiate:*** to create an instance (object) of a class

 - ***interface:*** similar to a class, but contains only abstract methods (and possibly constants)
 - ***adapter class:*** a class that implements an interface but has only empty method bodies


