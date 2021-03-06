/* Utility class for doing tests.  Call 'is' for each test, then call 'end'. */
class Tester {
    private int tests;

    void is(Object x, Object y) {
        tests++;
        if (x == y) return;
        if (x != null && x.equals(y)) return;
        throw new Error("Test failed: " + x + ", " + y);
    }

    void end() {
        System.out.println("Tests passed: " + tests);
    }
}