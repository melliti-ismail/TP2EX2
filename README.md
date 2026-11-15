# TP2EX2
Ex2 , ISMAIL MELLITI , TP2
class Courrier {
    {static} + double TARIF_DE_BASE = 0.5
    # boolean express
    # String adresseDestination
    + Courrier(express: boolean, adresseDestination: String)
    + estValide(): boolean
    + decrire(): void
    + affranchir(): double
}

class Lettre {
    - double poids
    - String format
    + Lettre(express: boolean, adresseDestination: String, poids: double, format: String)
    + decrire(): void
    + affranchir(): double
}

class Colis {
    - double poids
    - double volume
    + Colis(express: boolean, adresseDestination: String, poids: double, volume: double)
    + decrire(): void
    + affranchir(): double
}

class BoiteCourrier {
    - Courrier[] courriers
    - int taille
    + BoiteCourrier(n: int)
    + ajouterCourrier(c: Courrier): boolean
    + affranchir(): double
    + courriersInvalides(): int
    + afficher(): void
}

Courrier <|-- Lettre
Courrier <|-- Colis
BoiteCourrier "1" o-- "0..n" Courrier : contient >
