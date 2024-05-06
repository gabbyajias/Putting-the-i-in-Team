const teamMembers=[
    {
        name:'Jack Hughes',
        position:'Forward',
        number:'86',
        skills:['high speed', 'Stickhandling', 'Shooting', 'Skating'],
        bio:'Jack Hughes is a highly skilled hockey player known for his exceptional speed, agility, and playmaking ability. As the first overall pick in the 2019 NHL Draft, he quickly made an impact in the league with his impressive hockey IQ and versatility on the ice. With a promising career ahead, Hughes continues to be a key player for his team, showcasing his talent and determination every game.',
        age:'22'

    }
{
        name:'Lionel Messi',
        age:36,
        activePlayer:true,
        position: 'forward',
        strengths: 'ball control',
        weaknesses: 'heading ability',
        skills: ['dribbling','shooting','passing'],
        biography: 'Messi is a really cool dude'
    }, {
        name:'Lionel Messi',
        age:36,
        activePlayer:true,
        position: 'forward',
        strengths: 'ball control',
        weaknesses: 'heading ability',
        skills: ['dribbling','shooting','passing'],
        biography: 'Messi is a really cool dude'
    },
]

function generateTeamCards(){
    const teamCardsContainer=document.getElementById('teamCards')
teamMembers.forEach(member => {
    const card = document.createElement('div')
card.classList.add('col-md-4')

card.innerHTML=`
<div class="card">
<div class="card-header">
${member.name}
    </div>
    <div class="card-body">
    <p><strong>Position</strong> ${member.position}</p>
 </div>
`
teamCardsContainer.appendChild(card)

});
}

window.onload = generateTeamCards()