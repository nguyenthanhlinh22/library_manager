class MemoryGame {
    constructor(images) {
      this.cardsContainer = document.getElementById('cards');
      this.images = images;
      this.totalPairs = images.length;
      this.selectedCards = [];
      this.matchedPairs = 0;
      this.coin = 0 ;  
    }
  
    createCards() {
      let doubledImages = this.images.concat(this.images);
      doubledImages = doubledImages.sort(() => Math.random() - 0.5);
    
      doubledImages.forEach(image => {
        const card = document.createElement('div');
        card.classList.add('card');
        card.style.backgroundImage = `url(${image})`;
        card.addEventListener('click', () => this.flipCard(card));
        this.cardsContainer.appendChild(card);
      });
    }
  
    flipCard(card) {
      if (this.selectedCards.length < 2 && !this.selectedCards.includes(card)) {
        card.classList.add('flipped');
        this.selectedCards.push(card);
      
        if (this.selectedCards.length === 2) {
          setTimeout(() => this.checkForMatch(), 500);
        }
      }
    }
  
    checkForMatch() {
      const [firstCard, secondCard] = this.selectedCards;
      const isMatch = firstCard.style.backgroundImage === secondCard.style.backgroundImage;
    
      if (isMatch) {
        this.selectedCards = [];
        this.matchedPairs++;
      
        if (this.matchedPairs === this.totalPairs) {
          alert('Congratulations! You won!');
        }
      } else {
        setTimeout(() => {
          firstCard.classList.remove('flipped');
          secondCard.classList.remove('flipped');
          this.selectedCards = [];
        }, 10);
      }
    }
  }
  
const images = [
  'public/image/1.jpg', 
  'public/image/2.jpg', 
  'public/image/3.jpg', 
  'public/image/4.jpg', 
  'public/image/5.jpg', 
  
];
const game = new MemoryGame(images);
game.createCards();
  