# lab4
Api do konwertowania tekstu na żądany format.

Program odbiera łańcuch znakowy oraz typ-format od klienta. Następnie api pobiera obliczone dane dotyczące podanego stringa od niezależnego, oddzielnego programu - w dowolnym formacie/typie.
Aplikacja konwertuje odebrane dane na typ, o który poprosił klient.

Api działa na localhost:8082

Sposób wywołania:
.../conversion/string/typ
string - argument, ktory chcemy obliczyc
typ - format, w ktorym chcemy zwrocic dane

Przykład z formatem CSV:
http://localhost:8082/conversion/Test123/csv
Odpowiedź API:
Upper_letters,Lower_letters, Numbers, Special_characters 1,3,3,0

Przykład z formatem txt:
http://localhost:8082/conversion/Test123/csv
Odpowiedź API:
upperLetters: 1lowerLetters: 3numbers: 3special characters: 0

Przykład z formatem json:
http://localhost:8082/conversion/Test123/json
Odpowiedź API:
{ "upperLetters": 1, "lowerLetters": 3, "numbers": 3, "specialCharacters": 0 }

Przykład z formatem xml:
http://localhost:8082/conversion/Test123/json
Odpowiedź API:
1, 3, 3, 0,



