package hangman.setup.guice;

import com.google.inject.AbstractModule;
import hangman.model.English;
import hangman.model.Language;
import hangman.model.dictionary.EnglishDictionaryDataSource;
import hangman.model.dictionary.HangmanDictionary;
import hangman.view.HangmanPanel;
import hangman.view.HangmanStickmanPanel;
import hangman.model.GameScore;
import hangman.model.OriginalScore;

public class ModuleHangmanDefault extends AbstractModule {
	
	@Override
	protected void configure() {
		bind(Language.class).to(English.class);
		bind(HangmanDictionary.class).to(EnglishDictionaryDataSource.class);
		bind(HangmanPanel.class).to(HangmanStickmanPanel.class);
		bind(GameScore.class).to(OriginalScore.class);
	}

}
