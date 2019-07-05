//Извиняюсь по поводу графика 4-й задачи.
public class Main {
    public static void main(String args[]){
        Task232('q');
    }
    static void Task21(int x1, int x2, int x3, int y1, int y2, int y3){
        if((x2-x1)*(y3-y1)-(y2-y1)*(x3-x1)==0) System.out.println("Лежат на одной прямой.");
        else System.out.println("Треугольник.");
    }
    static void Task22(int n){
        int headNum = 3;
        for(int i=1;i<n && i<200; i++){
            headNum+=3;
        }
        for(int i=200; i<n && i<300; i++){
            headNum+=2;
        }
        for(int i=300; i<n; i++){
            headNum++;
        }
        System.out.println("Голов - "+headNum+", глаз - "+headNum*2);
    }
    static void Task231(char ch){
        if(ch=='a'||ch=='q'||ch=='e'||ch=='y'||ch=='u'||ch=='i'||ch=='o'){
            System.out.println("Гласная.");
            return;
        }
        if(ch=='A'||ch=='Y'||ch=='E'||ch=='Q'||ch=='U'||ch=='I'||ch=='O'){
            System.out.println("Гласная.");
            return;
        }
        System.out.println("Не гласная.");
    }
    static void Task232(char ch){
        String vowels = "aAqQeEyYuUoOiI";
        Character t = ch;
        if(vowels.contains(t.toString())){
            System.out.println("Гласная.");
        }
        else {
            System.out.println("Не гласная.");
        }
    }
    static void Task233(char ch) {
        char array[] = new char[14];
        array[0]='a';
        array[1]='A';
        array[2]='q';
        array[3]='Q';
        array[4]='e';
        array[5]='E';
        array[6]='y';
        array[7]='Y';
        array[8]='i';
        array[9]='I';
        array[10]='o';
        array[11]='O';
        array[12]='u';
        array[13]='U';
        for(char t:array){
            if(t==ch){
                System.out.println("Гласная.");
                return;
            }
        }
        System.out.println("Негласная.");

    }
    static void Task234(char ch) {
        switch (ch){
            case 'q':
            case 'Q':
            case 'e':
            case 'E':
            case 'y':
            case 'Y':
            case 'u':
            case 'U':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'a':
            case 'A':
                System.out.println("Гласная.");
                break;

                default://Что-то сломалось. Оно должно быть как и остальные кейсы.
                    System.out.println("Не гласная.");
                    break;
        }
    }
    static void Task24(int day, int month, int year){
        day++;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(day>31){
                    day=1;
                    month++;
                    if(month==13){
                        month=1;
                        year++;
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(day>30){
                    day=1;
                    month++;
                }
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)){
                    if(day>29){
                        day=1;
                        month=3;
                    }
                }
                else {
                    if(day>28){
                        day=1;
                        month=3;
                    }
                }
                break;
            default:
                System.out.println("Несуществующий месяц.");
                break;
        }
        System.out.println("День: "+day+",месяц: "+month+",год: "+year);
    }

}
