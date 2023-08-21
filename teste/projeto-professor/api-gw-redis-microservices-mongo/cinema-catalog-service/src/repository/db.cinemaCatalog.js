db.cinemaCatalog.insertMany([{
    cidade: "Campina Grande",
    uf: "PB",
    cinemas: []
},
{
    cidade: "João Pessoa",
    uf: "PB",
    pais: "BR",
    cinemas: [
        {
            _id: ObjectId(),
            nome: "Cinepólis Mangabeira Shopping",
            salas: [
                {
                    nome: 'Sala 1',
                    sessoes: [
                        {
                            data: ISODate("2023-04-04T09:00:00Z"),
                            idFilme: ObjectId("6453677f8827105321591697"),
                            filme: "Vingadores: Guerra Infinita",
                            valor: 25.00,
                            assentos: [
                                { numero: 1, disponivel: true },
                                { numero: 2, disponivel: false },
                            ]
                        },
                        {
                            data: ISODate("2023-04-04T11:00:00Z"),
                            idFilme: ObjectId("6453677f8827105321591697"),
                            filme: "Vingadores: Guerra Infinita",
                            valor: 25.00,
                            assentos: [
                                { numero: 1, disponivel: true },
                                { numero: 2, disponivel: true },
                            ]
                        },
                        {
                            data: ISODate("2023-04-04T13:00:00Z"),
                            idFilme: ObjectId("6453677f8827105321591698"),
                            filme: "Vingadores: Era de Ultron",
                            valor: 20.00,
                            assentos: [
                                { numero: 1, disponivel: true },
                                { numero: 2, disponivel: false },
                                { numero: 2, disponivel: true },
                            ]
                        }
                    ]
                },
                {
                    nome: 'Sala 2',
                    sessoes: [
                        {
                            data: ISODate("2023-04-04T09:00:00Z"),
                            idFilme: ObjectId("6453677f8827105321591698"),
                            filme: "Vingadores: Era de Ultron",
                            valor: 25.00,
                            assentos: [
                                { numero: 1, disponivel: true },
                                { numero: 2, disponivel: false },
                            ]
                        },
                        {
                            data: ISODate("2023-04-04T11:00:00Z"),
                            idFilme: ObjectId("6453677f8827105321591698"),
                            filme: "Vingadores: Era de Ultron",
                            valor: 25.00,
                            assentos: [
                                { numero: 1, disponivel: true },
                                { numero: 2, disponivel: true },
                            ]
                        },
                        {
                            data: ISODate("2023-04-04T13:00:00Z"),
                            idFilme: ObjectId("6453677f8827105321591698"),
                            filme: "Vingadores: Era de Ultron",
                            valor: 20.00,
                            assentos: [
                                { numero: 1, disponivel: true },
                                { numero: 2, disponivel: false },
                                { numero: 2, disponivel: true },
                            ]
                        }
                    ]
                }
            ]
        },
        {
            _id: ObjectId(),
            nome: "Cinesercla Shopping Tambiá",
            salas: [
                {
                    nome: 'Sala 100',
                    sessoes: [
                        {
                            data: ISODate("2023-04-04T09:00:00Z"),
                            idFilme: ObjectId("6453677f8827105321591699"),
                            filme: "Os Vingadores",
                            valor: 25.00,
                            assentos: [
                                { numero: 1, disponivel: true },
                                { numero: 2, disponivel: false },
                            ]
                        },
                        {
                            data: ISODate("2023-04-04T11:00:00Z"),
                            idFilme: ObjectId("6453677f8827105321591699"),
                            filme: "Os Vingadores",
                            valor: 25.00,
                            assentos: [
                                { numero: 1, disponivel: true },
                                { numero: 2, disponivel: true },
                            ]
                        },
                        {
                            data: ISODate("2023-04-04T13:00:00Z"),
                            idFilme: ObjectId("6453677f8827105321591698"),
                            filme: "Vingadores: Era de Ultron",
                            valor: 20.00,
                            assentos: [
                                { numero: 1, disponivel: true },
                                { numero: 2, disponivel: false },
                                { numero: 2, disponivel: true },
                            ]
                        }
                    ]
                }
            ]
        }
    ]
}])