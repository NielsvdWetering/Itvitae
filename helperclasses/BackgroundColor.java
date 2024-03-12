package helperclasses;

public enum BackgroundColor {
    BLACK("\u001b[40m"),
    WHITE("\u001b[47m"),
    RED("\u001b[41m"),
    GREEN("\u001b[42m"),
    YELLOW("\u001b[43m"),
    BLUE("\u001b[44m"),
    CYAN("\u001b[46m"),
    MAGENTA("\u001b[45m"),
    RESET("\u001b[0m");

    final String ansiCode;

    BackgroundColor(String ansiCode) {
        this.ansiCode = ansiCode;
    }

    @Override
    public String toString() {
        return ansiCode;
    }
}
