import java.util.List;

public class RecursionTester {
    public static void main(String[] args) {
        ListNode d = new ListNode("d", null);
        ListNode c = new ListNode("c", d);
        ListNode b = new ListNode("b", c);
        ListNode a = new ListNode("a", b);

        Recursion.printListInReverse(a);

        String[][] grid = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int index = 0; index < 5; index++) {
                grid[i][index] = i + ", " + index;
            }
        }
        grid[3][3] = "vaccinated";

        Recursion.infect(grid, 2, 3);
        for (int r = 0; r < 5; r++) {
            for (int col = 0; col < 5; col++) {
                System.out.println(grid[r][col]);
            }
        }

        System.out.println(Recursion.countNonConsecutiveSubsets(6));
        System.out.println(Recursion.countWaysToJumpUpStairs(5));

    }
}
