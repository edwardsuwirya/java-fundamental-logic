import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Each mini bus can only carry at most 4 passengers.
one bus can't take more than two family

Input the number of families : 5
Input the number of members in the family : 1 2 4 3 3
Minimum bus required is : 4

Input the number of families : 8
Input the number of members in the family : 2 3 4 4 2 1 3 1
Minimum bus required is : 5

Input the number of families : 5
Input the number of members in the family : 1 5
Input must be equal with count of family
 */
public class BusPassenger {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new RuntimeException("No argument provided");
        }
        try {
            String familyNum = args[0];
            int iFamilyNum = Integer.parseInt(familyNum);
            if (args.length != iFamilyNum + 1) {
                throw new RuntimeException("Input must be equal with count of family");
            }
            String[] memberFamilyNum = Arrays.copyOfRange(args, 1, args.length);
            List<String> iMemberFamilyNum = Arrays.stream(memberFamilyNum).collect(Collectors.toList());
            Integer numOfBus = 0;
            do {
                Integer temp = Integer.parseInt(iMemberFamilyNum.get(0));
                iMemberFamilyNum.remove(0);
                for (int j = 0; j <= iMemberFamilyNum.size() - 1; j++) {
                    Integer nextFamilyNum = Integer.parseInt(iMemberFamilyNum.get(j));
                    if (temp + nextFamilyNum == 4) {
                        iMemberFamilyNum.remove(j);
                        break;
                    }
                }
                numOfBus++;
            } while (iMemberFamilyNum.size() > 0);
            System.out.println(numOfBus);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Must be a number");
        }

    }
}
