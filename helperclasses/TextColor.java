package helperclasses;

public enum TextColor {
    BLACK("\u001b[30m"),
    RED("\u001b[31m"),
    BLUE("\u001b[34m"),
    GREEN("\u001b[32m"),
    YELLOW("\u001b[33m"),
    MAGENTA("\033[35m"),
    CYAN("\033[96m"),
    WHITE("\u001b[37m"),
    RESET("\u001b[0m");

    final String ansiCode;

    TextColor(String ansiCode) {
        this.ansiCode = ansiCode;
    }

    @Override
    public String toString() {
        return ansiCode;
    }
}
