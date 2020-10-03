package murait.validation;

class Constants {
    static final String emailPattern = "([\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Za-z]{2,4})";
    static final String[] phonePatterns = {"\\d{10}",
            "\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}",
            "\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}",
            "\\(\\d{3}\\)-\\d{3}-\\d{4}"};
}
