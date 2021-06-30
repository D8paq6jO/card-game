package cards;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Card {
    int value;
    Suite suite;

    public void setValue(int value) throws Exception {
        if (value<2 || value>14){
            throw new Exception("the value of the cars must be between 2 and 14");
        }
    }
}
