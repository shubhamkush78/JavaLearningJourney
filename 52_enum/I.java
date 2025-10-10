enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class I {
    public static void main(String[] args) {
        Days[] arr = Days.values();

        for(Days next : arr) {
            System.out.println(next);
        }
    }    
}
