package Study01;

import java.util.Calendar;

public class MyDate {
    // private로 선언한 변수 선언
    private int day;
    private int month;
    private int year;
    private boolean isValid = true; // 날짜가 유효한지 확인용

    // day, month, year를 매개변수로 받는 생성자 선언
    public MyDate(int day, int month, int year) {
        // setter를 통해 유효한 값인지 확인하기 위함
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    // public으로 get, set 메서드 정의
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (day <1 || day >31) {
                    isValid = false;
                }
                else {
                    this.day = day;
                }
                break;
            case 4: case 6: case 9: case 11:
                if (day <1 || day >30) {
                    isValid = false;
                }
                else {
                    this.day = day;
                }
                break;
            case 2:
               // 윤년 계산이 너무 어려워서 생략함
                    if (day <1 || day >28) {
                        isValid = false;
                    }
                    else {
                        this.day = day;
                    }
                break;
            default:
                isValid = false;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if( month <1 || month >12) {
            isValid = false;
        }
        else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > Calendar.getInstance().get(Calendar.YEAR)) {
            isValid = false;
        }
        else {
            this.year = year;
        }
    }

    // isValid 함수 정의
    public String isValid() {

        if(isValid) {
            return "유효한 날짜입니다.";
        }
        else {
            return "유효하지 않은 날짜입니다.";
        }
    }
}
