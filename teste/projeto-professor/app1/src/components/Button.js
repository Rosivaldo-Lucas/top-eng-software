const Button = (props)  => (
<div>
    <button onClick={ ()=>
        props.onClick() } > { props.label}
    </button>
</div>
)

export default Button;


