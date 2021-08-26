import static org.junit.jupiter.api.Assertions.*;

class SLLOperationsTest {

    @org.junit.jupiter.api.Test
    void testDeleteData_Successful() {
        SLLOperations SLL = new SLLOperations();
        SLL.Add(SLL,56);
        SLL.Add(SLL,30);
        SLL.Add(SLL,40);
        SLL.Add(SLL,70);
        assertTrue(SLL.DeleteData(SLL,40));
    }

    @org.junit.jupiter.api.Test
    void testDeleteData_Unsuccessful() {
        SLLOperations SLL = new SLLOperations();
        SLL.Add(SLL,56);
        SLL.Add(SLL,30);
        SLL.Add(SLL,40);
        SLL.Add(SLL,70);
        assertFalse(SLL.DeleteData(SLL,60));
    }
}