Git - good practices 
* commit powinien miec dobry opis 
* commit powinien zawierac jedna zmiane
* zmiana opisu tylko dla ostatniego commita (amend)
* podruzuj po historii i branchach, tylko przy czystym drzewie roboczym
* usuwanie branch'y
    * zmergowany branch można usunąć
    * nie powinniśmy usuwać nie zmergowanych branch'y, bo nie bedziemy mieli jak do nich wrocic

    * nie usuwamy branch'a na którym aktualnie się znajdujemy:)
  
* git flow - w skrócie
    * master - branch release'owy
    * develop - branch developerski
    * feature branch - branch do rozwoju funkcjonalności
    * feature branch - powinien startować od developa i do niego finalnie zostać zmergowany
* branch
  * własny branch nie musi być idealny (może nie działać, może zawierać komentarze FIXME/TODO),
    ale wysłanie merge requesta z tego brancha musi zawierać "piękny kod"
    
Git - przydatne komendy
git status
git add .             // dodaj wszystkie pliki do poczekalni
git add file_name    //(dodanie okreslonego pliku zamiast wszystkich zmian) 
git commit -m "[tag] - message"
git restore --staged file-name // zdejmij ze stage'a
git checkout branch-name // przełącz się na branch-name
git checkout -b branch-name // przełącz na nowo utworzony branch