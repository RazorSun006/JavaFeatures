package Concurrency.Thread.TypingGame;

public interface CharacterSource {
     void addCharacterListener(CharacterListener cl);
     void removeCharacterListener(CharacterListener cl);
     void nextCharacter( );
}
