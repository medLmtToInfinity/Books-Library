package com.example.bookslibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookslibrary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var recycleView: RecyclerView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        recycleView = binding.recycleView

        val books = arrayOf(
            Book("The Lost Symphony", "Eleanor Richards", "Mystery", "An ancient melody holds the key to a long-buried secret.", "978-1-234567-89-0", "4.5", R.drawable.book_cover1),
            Book("Whispers of the Abyss", "Jonathan Archer", "Thriller", "In the darkest corners of the mind, a conspiracy unfolds.", "978-1-234567-89-1", "4.2", R.drawable.book_cover2),
            Book("Realm of Shadows", "Lucia Rodriguez", "Fantasy", "Magic and destiny collide in a world teetering on the edge.", "978-1-234567-89-2", "4.8", R.drawable.book_cover3),
            Book("Quantum Nexus", "Christopher Turner", "Science Fiction", "A breakthrough in quantum technology triggers a race against time.", "978-1-234567-89-3", "4.0", R.drawable.book_cover4),
            Book("City of Echoes", "Olivia Mitchell", "Mystery", "A detective's hunt for a serial killer in a city that never sleeps.", "978-1-234567-89-4", "4.6", R.drawable.book_cover5),
            Book("The Celestial Odyssey", "Robert Harris", "Fantasy", "Embark on a celestial journey to save a world on the brink of destruction.", "978-1-234567-89-5", "4.3", R.drawable.book_cover6),
            Book("Silent Conspiracy", "Grace Thompson", "Thriller", "Unraveling the truth becomes a matter of life and death.", "978-1-234567-89-6", "4.7", R.drawable.book_cover7),
            Book("Ephemeral Enchantment", "Sebastian Lewis", "Fantasy", "A forbidden love story set in a world where magic comes at a cost.", "978-1-234567-89-7", "4.4", R.drawable.book_cover8),
            Book("The Quantum Paradox", "Natalie Wright", "Science Fiction", "As parallel worlds collide, a physicist must save reality itself.", "978-1-234567-89-8", "4.9", R.drawable.book_cover9),
            Book("Echoes of Destiny", "Daniel Carter", "Mystery", "The echoes of a crime reverberate through generations.", "978-1-234567-89-9", "4.1", R.drawable.book_cover10),
            Book("The Forgotten Citadel", "Victoria Adams", "Fantasy", "In the heart of a forgotten land, a hidden power awakens.", "978-1-234567-89-10", "4.6", R.drawable.book_cover11),
            Book("Spectral Whispers", "Jameson Scott", "Thriller", "A detective races against time to stop a spectral killer.", "978-1-234567-89-11", "4.2", R.drawable.book_cover12),
            Book("Chronicles of Lumina", "Emily Turner", "Fantasy", "A prophecy unfolds as darkness threatens to consume the realm.", "978-1-234567-89-12", "4.7", R.drawable.book_cover13),
            Book("The Quantum Cipher", "Benjamin Anderson", "Science Fiction", "Unravel the secrets of quantum computing in this mind-bending adventure.", "978-1-234567-89-13", "4.3", R.drawable.book_cover14),
            Book("The Enchanted Forest", "Isabel Green", "Fantasy", "Step into a world of enchantment and magical creatures.", "978-1-234567-89-14", "4.7", R.drawable.book_cover15),
            Book("Whispers in the Wind", "Harrison Ford", "Mystery", "A small town conceals a web of secrets and lies.", "978-1-234567-89-15", "4.5", R.drawable.book_cover16),
            Book("Shadows of Tomorrow", "Sophie Turner", "Thriller", "A mind-bending thriller that challenges the concept of reality.", "978-1-234567-89-16", "4.2", R.drawable.book_cover17),
            Book("Sorcerer's Legacy", "Nicholas Black", "Fantasy", "A young sorcerer discovers his true potential in a world of magic.", "978-1-234567-89-17", "4.8", R.drawable.book_cover18),
            Book("Beyond the Stars", "Emma Davis", "Science Fiction", "Exploring the vastness of space brings unexpected challenges.", "978-1-234567-89-18", "4.0", R.drawable.book_cover19),
            Book("City of Whispers", "Maxwell Roberts", "Mystery", "The city's secrets are whispered in the alleyways at night.", "978-1-234567-89-19", "4.6", R.drawable.book_cover20),
            Book("The Crystal Throne", "Ava Taylor", "Fantasy", "A quest for the legendary crystal throne unfolds in a magical realm.", "978-1-234567-89-20", "4.3", R.drawable.book_cover21),
            Book("The Vanishing Act", "Christopher Adams", "Thriller", "Illusions and deception shroud a series of mysterious disappearances.", "978-1-234567-89-21", "4.7", R.drawable.book_cover22),
            Book("Eternal Echoes", "Emily Turner", "Fantasy", "A tale of love and sacrifice that echoes through eternity.", "978-1-234567-89-22", "4.4", R.drawable.book_cover23),
            Book("The Quantum Mirage", "Alexander Carter", "Science Fiction", "A physicist's journey through the quantum realm unveils a mirage of possibilities.", "978-1-234567-89-23", "4.9", R.drawable.book_cover24),
            Book("Fading Shadows", "Grace Thompson", "Mystery", "Investigating a series of mysterious disappearances leads to dark revelations.", "978-1-234567-89-24", "4.1", R.drawable.book_cover25),
            Book("The Forbidden Kingdom", "Oliver Harris", "Fantasy", "A forbidden love sparks a rebellion against a tyrannical king.", "978-1-234567-89-25", "4.6", R.drawable.book_cover26),
            Book("Whispers in the Dark", "Sophia Adams", "Thriller", "A psychological thriller that explores the depths of the human mind.", "978-1-234567-89-26", "4.2", R.drawable.book_cover27),
            Book("Chronicles of Eldoria", "Lucas Turner", "Fantasy", "A quest to save a magical realm from an ancient evil.", "978-1-234567-89-27", "4.7", R.drawable.book_cover28),
            Book("The Quantum Enigma", "Natalie Walker", "Science Fiction", "A scientist unravels the enigma of quantum entanglement.", "978-1-234567-89-28", "4.3", R.drawable.book_cover29),
            Book("The Whispering Forest", "Isaac Green", "Fantasy", "A journey through a mystical forest reveals secrets of the past.", "978-1-234567-89-29", "4.7", R.drawable.book_cover30),
            Book("City of Shadows", "Olivia Turner", "Mystery", "Shadows hold the key to a city's unsolved mysteries.", "978-1-234567-89-30", "4.6", R.drawable.book_cover31),
            Book("The Celestial Prophecy", "Robert Turner", "Fantasy", "A prophecy foretells the rise of a chosen one in a celestial war.", "978-1-234567-89-31", "4.3", R.drawable.book_cover32),
            Book("The Silent Mirage", "David Archer", "Thriller", "In a world of silence, a dangerous conspiracy thrives.", "978-1-234567-89-32", "4.7", R.drawable.book_cover33),
            Book("Eternal Whispers", "Sophie Turner", "Fantasy", "Whispers from the past guide a young hero on a quest.", "978-1-234567-89-33", "4.4", R.drawable.book_cover34),
            Book("The Quantum Paradox", "Michael Harris", "Science Fiction", "A paradox in quantum reality threatens to unravel the fabric of existence.", "978-1-234567-89-34", "4.9", R.drawable.book_cover35),
            Book("City of Echoes", "Grace Mitchell", "Mystery", "Echoes of the past reverberate in the present-day cityscape.", "978-1-234567-89-35", "4.1", R.drawable.book_cover36),
            Book("Sorcerer's Legacy", "Daniel Adams", "Fantasy", "The legacy of a powerful sorcerer unfolds in a magical realm.", "978-1-234567-89-36", "4.6", R.drawable.book_cover37),
            Book("Beyond the Horizon", "Emily Turner", "Science Fiction", "Exploring the boundaries of the universe reveals unimaginable wonders.", "978-1-234567-89-37", "4.0", R.drawable.book_cover38),
            Book("City of Secrets", "Christopher Roberts", "Mystery", "A detective unravels a web of secrets that threaten to tear a city apart.", "978-1-234567-89-38", "4.6", R.drawable.book_cover39),
            Book("The Crystal Guardian", "Ava Turner", "Fantasy", "A young guardian must protect a crystal that holds the fate of a realm.", "978-1-234567-89-39", "4.3", R.drawable.book_cover40),
            Book("The Vanishing Shadows", "Benjamin Adams", "Thriller", "A journalist investigates a series of mysterious disappearances in the shadows.", "978-1-234567-89-40", "4.7", R.drawable.book_cover41),
            Book("Ephemeral Dreams", "Emma Turner", "Fantasy", "In a world of dreams, reality and fantasy intertwine in unexpected ways.", "978-1-234567-89-41", "4.4", R.drawable.book_cover42),
            Book("The Quantum Illusion", "Alexander Harris", "Science Fiction", "An illusion in the quantum realm challenges the limits of perception.", "978-1-234567-89-42", "4.9", R.drawable.book_cover43),
            Book("Fading Echoes", "Grace Mitchell", "Mystery", "Echoes of a forgotten crime resurface, demanding justice.", "978-1-234567-89-43", "4.1", R.drawable.book_cover44),
            Book("The Forbidden Realm", "Oliver Turner", "Fantasy", "A forbidden realm holds the key to a magical revolution.", "978-1-234567-89-44", "4.6", R.drawable.book_cover45),
            Book("Whispers in the Fog", "Sophia Archer", "Thriller", "In the fog of deception, a deadly plot unfolds.", "978-1-234567-89-45", "4.2", R.drawable.book_cover46),
            Book("Chronicles of Eldorado", "Lucas Harris", "Fantasy", "Embark on a quest through a mythical land in search of Eldorado.", "978-1-234567-89-46", "4.7", R.drawable.book_cover47),
            Book("The Quantum Cipher", "Natalie Adams", "Science Fiction", "Deciphering the quantum cipher reveals the secrets of the universe.", "978-1-234567-89-47", "4.3", R.drawable.book_cover48),
            Book("Lost in Translation", "Emily Wilson", "Drama", "A poignant story of love and loss.", "978-1-234567-89-48", "4.6", R.drawable.book_cover49),
            Book("The Quantum Cipher", "Benjamin Anderson", "Science Fiction", "Unravel the secrets of quantum computing in this mind-bending adventure.", "978-1-234567-89-49", "4.3", R.drawable.book_cover50)
        )

        recycleView.adapter = RecycleViewAdapter(this, books);
        recycleView.layoutManager = GridLayoutManager(this, 3)
    }
}