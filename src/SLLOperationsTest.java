import static org.junit.jupiter.api.Assertions.*;

class SLLOperationsTest {

    @org.junit.jupiter.api.Test
    void testSearch() {
        SLLOperations SLL = new SLLOperations();
        SLL.Add(SLL,56);
        SLL.Add(SLL,30);
        SLL.Add(SLL,70);
        assertTrue(SLL.Search(SLL,30));
    }
}