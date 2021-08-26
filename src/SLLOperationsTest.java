import static org.junit.jupiter.api.Assertions.*;

class SLLOperationsTest {

    @org.junit.jupiter.api.Test
    void testInsertAfter() {
        SLLOperations SLL = new SLLOperations();
        SLL.Add(SLL,56);
        SLL.Add(SLL,30);
        SLL.Add(SLL,70);
        assertTrue(SLL.InsertAfter(SLL,40,30));
    }
}