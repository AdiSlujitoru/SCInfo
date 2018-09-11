public class BubbleSort  {
Person[] sortPersonsByAge(Person[]people){
    int n=people.length;
    for (int i = 0; i < n-1; i++)
        for (int j = 0; j < n-i-1; j++)
            if (people[j].a3 > people[j+1].a3) {
                //BubbleSorting
                int temp = people[j].a3;
                people[j].a3 = people[j + 1].a3;
                people[j + 1].a3 = temp;
            }
    return people;
}

}



