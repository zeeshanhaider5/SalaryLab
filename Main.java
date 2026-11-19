public class Main{
    // returns salary as hours multilpied by rate.
    public static int calculateSalary(int hours, int rate){
        return hours * rate;
    }

    //return High (>=50000), Medium (>=30000) or Low category.
    public static String getCategory(int salary){
        if (salary >= 50000) return "High";
        else if (salary >= 30000) return "Medium";
        else return "Low";
    }

    // Returns true only if hours are between 0 and 60.
    public static boolean isValid(int hours){
        return hours >= 0 && hours <= 60;
    }

    public static void main (String[] args){
        String[] names = {"Hina", "Omar", "Zara", "Bilal"};
        int[] hours = {40, 25, 70, 55};
        int rate = 1000;
        int validCount = 0;
        int total = 0;

        for (int i = 0; i < names.length; i++) {
            if (!isValid(hours[i])) {
                System.out.println("Invalid hours for " + names[i]);
                continue;
            }
            int salary = calculateSalary(hours[i], rate);
            System.out.println(names[i] + ": " + hours[i] + " hours, Rs " + salary + " " + getCategory(salary));
            validCount++;
            total += salary;
        }
       System.out.println("Valid employees: " + validCount);
       System.out.println("Total salary: " + total);
       System.out.println("Average salary: " + (double) total / validCount); 
    }
}