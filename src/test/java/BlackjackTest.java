import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class BlackjackTest {

    private Blackjack blackjack;

    @Before
    public void setUp() {
        blackjack = new Blackjack();
    }

    @Test
    public void correctParsesAce () {
        assertEquals(blackjack.parseCard("ace"),11);
    }

    @Test
    public void correctParsesTwo () {
        assertEquals(blackjack.parseCard("two"),2);
    }

    @Test
    public void correctParsesThree () {
        assertEquals(blackjack.parseCard("three"),3);
    }

    @Test
    public void correctParsesFour () {
        assertEquals(blackjack.parseCard("four"),4);
    }

    @Test
    public void correctParsesFive () {
        assertEquals(blackjack.parseCard("five"),5);
    }

    @Test
    public void correctParsesSix () {
        assertEquals(blackjack.parseCard("six"),6);
    }

    @Test
    public void correctParsesSeven () {
        assertEquals(blackjack.parseCard("seven"),7);
    }

    @Test
    public void correctParsesEight () {
        assertEquals(blackjack.parseCard("eight"),8);
    }

    @Test
    public void correctParsesNine () {
        assertEquals(blackjack.parseCard("nine"),9);
    }

    @Test
    public void correctParsesTen () {
        assertEquals(blackjack.parseCard("ten"),10);
    }

    @Test
    public void correctParsesJack () {
        assertEquals(blackjack.parseCard("jack"),10);
    }

    @Test
    public void correctParsesQueen () {
        assertEquals(blackjack.parseCard("queen"),10);
    }

    @Test
    public void correctParsesKing () {
        assertEquals(blackjack.parseCard("king"),10);
    }
    
    @Test
    public void blackjackWithTenAceSecond() {
        assertEquals(blackjack.isBlackjack("ten", "ace"),true);
    }
    
    @Test
    public void blackjackWithJackAceSecond() {
        assertEquals(blackjack.isBlackjack("jack", "ace"),true);
    }
    
    @Test
    public void blackjackWithQueenAceSecond() {
        assertEquals(blackjack.isBlackjack("queen", "ace"),true);
    }
    
    @Test
    public void blackjackWithKingAceSecond() {
        assertEquals(blackjack.isBlackjack("king", "ace"),true);
    }   
    
    
    @Test
    public void noBlackjackWithFive() {
        assertEquals(blackjack.isBlackjack("ace", "five"),false);
    }
    
    @Test
    public void noBlackjackWithNine() {
        assertEquals(blackjack.isBlackjack("ace", "nine"),false);
    }
    
    @Test
    public void noBlackjackWithTwoAces() {
        assertEquals(blackjack.isBlackjack("ace", "ace"),false);
    }
    
    @Test
    public void noBlackjackWithTwoFigures() {
        assertEquals(blackjack.isBlackjack("queen", "jack"),false);
    }
    
    @Test
    public void noBlackjackWithKingAndFive() {
        assertEquals(blackjack.isBlackjack("king", "five"),false);
    }
    
    @Test
    public void noBlackjackWithEightAndFive() {
        assertEquals(blackjack.isBlackjack("eight", "five"),false);
    }
    
    @Test
    public void firstTurnWithAceAceAndDealerAce () {
        assertEquals(blackjack.firstTurn("ace", "ace", "ace"),"P");
    }
    
    @Test
    public void firstTurnWithJackJackAndDealerAce () {
        assertEquals(blackjack.firstTurn("jack", "jack", "ace"),"S");
    }
    
    @Test
    public void firstTurnWithKingKingAndDealerAce () {
        assertEquals(blackjack.firstTurn("king", "king", "ace"),"S");
    }

    @Test
    public void firstTurnWithTwoTwoAndDealerAce () {
        assertEquals(blackjack.firstTurn("two", "two", "ace"),"H");
    }

    @Test
    public void firstTurnWithFiveFiveAndAce () {
        assertEquals(blackjack.firstTurn("five", "five", "ace"),"H");
    }

    @Test
    public void firstTurnWithJackAceAndDealerAce () {
        assertEquals(blackjack.firstTurn("jack", "ace", "ace"),"S");
    }

    @Test
    public void firstTurnWithAceKingAndDealerQueen () {
        assertEquals(blackjack.firstTurn("ace", "king", "queen"),"S");
    }

    @Test
    public void firstTurnWithTenAceAndDealerFive () {
        assertEquals(blackjack.firstTurn("ten", "ace", "five"),"W");
    }

    @Test
    public void firstTurnWithKingAceAndDealerNine () {
        assertEquals(blackjack.firstTurn("king", "ace", "nine"),"W");
    }

    @Test
    public void firstTurnWithKingTenAndDealerAce () {
        assertEquals(blackjack.firstTurn("king", "ten", "ace"),"S");
    }

    @Test
    public void firstTurnWithNineTenAndDealerAce () {
        assertEquals(blackjack.firstTurn("nine", "ten", "ace"),"S");
    }

    @Test
    public void firstTurnWithEightTenAndDealerAce () {
        assertEquals(blackjack.firstTurn("eight", "ten", "ace"),"S");
    }

    @Test
    public void firstTurnWithKingSevenAndDealerAce () {
        assertEquals(blackjack.firstTurn("king", "seven", "ace"),"S");
    }

    @Test
    public void firstTurnWithSixTenAndDealerSix () {
        assertEquals(blackjack.firstTurn("six", "ten", "six"),"S");
    }

    @Test
    public void firstTurnWithSixTenAndDealerSeven () {
        assertEquals(blackjack.firstTurn("six", "ten", "seven"),"H");
    }

    @Test
    public void firstTurnWithSixTenAndDealerAce () {
        assertEquals(blackjack.firstTurn("six", "ten", "ace"),"H");
    }

    @Test
    public void firstTurnWithFiveTenAndDealerSix () {
        assertEquals(blackjack.firstTurn("five", "ten", "six"),"S");
    }

    @Test
    public void firstTurnWithFiveTenAndDealerSeven () {
        assertEquals(blackjack.firstTurn("five", "ten", "seven"),"H");
    }

    @Test
    public void firstTurnWithFiveTenAndDealerKing () {
        assertEquals(blackjack.firstTurn("five", "ten", "king"),"H");
    }

    @Test
    public void firstTurnWithFourTenAndDealerSix () {
        assertEquals(blackjack.firstTurn("four", "ten", "six"),"S");
    }

    @Test
    public void firstTurnWithFourTenAndDealerSeven () {
        assertEquals(blackjack.firstTurn("four", "ten", "seven"),"H");
    }

    @Test
    public void firstTurnWithFourTenAndDealerQueen () {
        assertEquals(blackjack.firstTurn("four", "ten", "queen"),"H");
    }

    @Test
    public void firstTurnWithThreeTenAndDealerSix () {
        assertEquals(blackjack.firstTurn("three", "ten", "six"),"S");
    }

    @Test
    public void firstTurnWithThreeTenAndDealerSeven () {
        assertEquals(blackjack.firstTurn("three", "ten", "seven"),"H");
    }

    @Test
    public void firstTurnWithThreeTenAndDealerQueen () {
        assertEquals(blackjack.firstTurn("three", "ten", "queen"),"H");
    }

    @Test
    public void firstTurnWithTwoTenAndDealerSix () {
        assertEquals(blackjack.firstTurn("two", "ten", "six"),"S");
    }

    @Test
    public void firstTurnWithTwoTenAndDealerSeven () {
        assertEquals(blackjack.firstTurn("two", "ten", "seven"),"H");
    }

    @Test
    public void firstTurnWithTwoTenAndDealerQueen () {
        assertEquals(blackjack.firstTurn("two", "ten", "queen"),"H");
    }

    @Test
    public void firstTurnWithTwoNineAndDealerQueen () {
        assertEquals(blackjack.firstTurn("two", "nine", "queen"),"H");
    }

    @Test
    public void firstTurnWithTwoEightAndDealerTwo () {
        assertEquals(blackjack.firstTurn("two", "eight", "two"),"H");
    }

    @Test
    public void firstTurnWithTwoThreeAndDealerQueen () {
        assertEquals(blackjack.firstTurn("two", "three", "queen"),"H");
    }

    @Test
    public void firstTurnWithTwoTwoAndDealerFive () {
        assertEquals(blackjack.firstTurn("two", "two", "five"),"H");
    }

}
