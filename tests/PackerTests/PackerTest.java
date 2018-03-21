package PackerTests;


import Kodu7.Packer.Packer;
import Kodu7.Sender.Sender;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class PackerTest {

    private Sender sender;
    private Packer packer;


    @Before
    public void setUp() {
        packer = mock(Packer.class);
        sender = mock(Sender.class);

    }

    @Test
    public void checkNoVocalsString() {
        Packer packer = new Packer();
        assertTrue(packer.removeVocals("kolm").equals("klm"));
        assertTrue(packer.removeVocals("neli").equals("nl"));
        assertTrue(packer.removeVocals("kolmsadakaks").equals("klmsdkks"));
        assertTrue(packer.removeVocals("Avastasime uue elevandiliigi, isendid on kollased ja oskavad laulda").equals("vstsm  lvndlg, sndd n kllsd j skvd lld"));
    }

    @Test
    public void kaed() {
        sender.saveMessage("kolm");
        verify(sender).saveMessage("kolm");
    }
    @Test
    public void testPackerIsUsedInWritingToFile() {
        sender = new Sender(packer);
        sender.saveMessage("Nägin ahvi!");
        sender.saveMessage("Moskiito hammustas kolleegi!");
        sender.writeToFile();
        verify(packer).removeVocals("Nägin ahvi!;Moskiito hammustas kolleegi!");
    }
    @Test
    public void testSavedMessagesMock() {
        sender.saveMessage("kolm");
        verify(sender).saveMessage("kolm");
    }

    @Test
    public void testMockMethodInteractionTwice() {
        sender.saveMessage("twice");
        sender.saveMessage("twice");
        verify(sender, times(2)).saveMessage("twice");
    }

}
