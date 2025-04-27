//Christopher Keenan
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for Contact creation
public class ContactTest {
    
    // Test method for Contact creation
    @Test
    public void testContactCreation() {
        Contact contact = new Contact("6099546654", "Chris", "Keenan", "6099546654", "9 Van Nostrand Court");
        
        // Assert that contact is not null
        assertNotNull(contact);
        
        // Assert that contact fields match the provided values
        assertEquals("1234567890", contact.getContactID());
        assertEquals("Chris", contact.getFirstName());
        assertEquals("Keenan", contact.getLastName());
        assertEquals("6099546654", contact.getPhone());
        assertEquals("9 Van Nostrand Court", contact.getAddress());
    }
}