Git - good practices

* commit powinien mieć dobry opis
* commit powinien zawierać jedną zmianę
* zmiana opisu tylko dla ostatniego commita (amend)
* podróżuj po historii i branchach tylko przy czystym drzewie roboczym
* usuwanie branch'y 
    * zmergowany branch można usunąć
    * nie powinniśmy usuwać nie zmergowanych branch'y bo nie będziemy w stanie wrócić do nich
    * nie usuwamy branch'a na którym aktualnie się znajdujemy:)
* git flow - w skrócie
    * master - branch release'owy
    * develop - branch developerski
    * feature branch - branch do rozwoju funkcjonalności
    * feature branch - powinien startować od developa i do niego finalnie zostać zmergowany

Git - przydatne komendy
git status
git add .
git commit -m "[tag] - message"
git restore --staged file-name // zdejmij ze stage'a
git checkout branch-name // przełącz się na branch-name
git checkout -b branch-name // przełącz na nowo utworzony branch
git log --graph // rysuje graf historii w konsoli
