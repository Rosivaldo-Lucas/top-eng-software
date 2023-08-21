import React from 'react';
import Button from './Button.js'

class Contador extends React.Component {

    constructor(props=0) {
        super(props);
        this.state = {
            contador: props.contador
        };
    }

    incrementa() {
        this.setState({
            contador: this.state.contador + 1
        })
    }

    decrementa() {
        this.setState({
            contador: this.state.contador - 1
        })
    }


    render() {
        return (<div>
            <h1> {
                this.state.contador
            }</h1>
            <Button label="+" onClick= {() => this.incrementa()}/>
            <Button label="-" onClick= {() => this.decrementa()}/>
        </div>);
    }

}
export default Contador;
