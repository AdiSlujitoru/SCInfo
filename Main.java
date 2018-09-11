class Main {

    public static void main(String[] args) {

        Person people[]=new Person[3];
        people[0]=new Person();
        people[1]=new Person();
        people[2]=new Person();
        people[0].getP("Pop","Gina",12);
        people[1].getP("Mihai","Radu",64);
        people[2].getP("Laur","Dan",8);


        BubbleSort sort = new BubbleSort();
        Person[] sorted = sort.sortPersonsByAge(people);
        for(int i=0; i<sorted.length; i++)
        {
            System.out.println(sorted[i].a1+" "+sorted[i].a2+" "+sorted[i].a3);
        }




    }

    }



