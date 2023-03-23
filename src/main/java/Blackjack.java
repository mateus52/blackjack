public class Blackjack {
    
    public String stand  = "S";
    public String hit   = "H";
    public String split  = "P";
    public String automaticallyWin  = "W";

    public int parseCard(String card) {
        int parse;
        switch(card){
            case "ace": parse = 11;break;
            case "two": parse = 2;break;
            case "three": parse = 3;break;
            case "four": parse = 4;break;
            case "five": parse = 5;break;
            case "six": parse = 6;break;
            case "seven": parse = 7;break;
            case "eight": parse = 8;break;
            case "nine": parse = 9;break;
            case "ten": parse = 10;break;
            case "jack": parse = 10;break;
            case "queen": parse = 10;break;
            case "king": parse = 10;break;
            default: parse = 0;break;  
        }
        return parse;
    }

    public boolean isBlackjack(String card1, String card2) {
        int blackjack = parseCard(card1) + parseCard(card2);
        if(blackjack == 21)
            return true;
        else
            return false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if(!isBlackjack)
            return split;
        else if(isBlackjack && (dealerScore != 11 && dealerScore != 10))
            return automaticallyWin;
        else 
            return stand;
    }

    public String smallHand(int handScore, int dealerScore) {//17,11
       if(handScore >= 17)
           return stand;
        else if(handScore <= 11 )
            return hit;
        else if(handScore > 11 && handScore <= 16 && dealerScore < 7)
            return stand;
        else 
            return hit;
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
